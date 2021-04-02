package com.dl.demo2.service;

import com.dl.demo2.model.Dev;
import com.dl.demo2.model.SystemPram;
import com.dl.demo2.model.User;
import com.dl.demo2.repository.SystemPramRepository;
import com.dl.demo2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserService {

    private static final String RESGIST_MEG_LEGAL = "ok";

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SystemPramRepository systemPramRepository;

    @Autowired
    private DevService devService;

    /**
     * 登录
     */
    public String login(String userEnName, String userPsw, Model model, HttpSession session) {
        User user = userRepository.findByUserEnName(userEnName);
        boolean flag = false;
        if(user != null && user.getUserPsw().equals(userPsw)) {
            flag = true;
        }
        model.addAttribute("loginIsWrong", !flag);
        if (flag){
            // 登录成功的话，将 user 信息 和 当前用户拥有的 dev 信息放入session
            List<Dev> devs = devService.getDevsByUserId(user.getUserId());
            session.setAttribute("user", user);
            session.setAttribute("devs", devs);
            session.setAttribute("curDev", devs.get(0)); // 设置 当前dev 的初值为 第一个dev
            System.out.println(user.getUserName() + " 登录成功");
            return "telemeter";
        } else {
            System.out.println("密码错误 登录失败");
            return "login";
        }
    }

    /**
     * 注册
     */
    public String logon(String userName, String userEnName, String userPsw, String userPhone,
                        String userEmail, String userUnit, Model model) {
        String logonMsg = checkResgistMegLegal(userEnName);
        model.addAttribute("logonMsg", checkResgistMegLegal(userEnName));
        if(!logonMsg.equals(RESGIST_MEG_LEGAL)) {
            model.addAttribute("cannotLogon", true);
            return "logon";
        }

        User user = new User(userName, userEnName, userPsw, userPhone, userEmail, userUnit);
        SystemPram systemPram = systemPramRepository.getSystemPram();
        Long userIdCount = systemPram.getUserIdCount();
        user.setUserId(userIdCount);
        systemPram.setUserIdCount(++userIdCount);
        systemPramRepository.save(systemPram);
        userRepository.save(user);

        return "logon-success";
    }

    /**
     * 进一步检测注册信息是否符合要求
     * 空串的检测交给前端，这里认为得到的值都已符合基本的输入规范
     *
     * 暂时仅检测 userEnName 字段是否已存在
     * @param userEnName
     * @return
     */
    private String checkResgistMegLegal(String userEnName) {
        return (userRepository.findByUserEnName(userEnName) == null) ? RESGIST_MEG_LEGAL : "用户英文名已被占用！";
    }
}
