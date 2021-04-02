package com.dl.demo2.controller;

import com.dl.demo2.model.User;
import com.dl.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    public String login(@RequestParam("userEnName") String userEnName,
                        @RequestParam("userPsw") String userPsw,
                        Model model, HttpSession session) {

        return userService.login(userEnName, userPsw, model, session);
    }

    /**
     * 前端检测返回值是否为 "注册成功"
     * 如果不是，则返回值就是报错信息
     * @param userName
     * @param userEnName
     * @param userPsw
     * @param userPhone
     * @param userEmail
     * @param userUnit
     * @return
     */
    @RequestMapping(value = "/api/logon", method = RequestMethod.POST)
    public String logon(@RequestParam("userName") String userName, @RequestParam("userEnName") String userEnName,
                        @RequestParam("userPsw") String userPsw, @RequestParam("userPhone") String userPhone,
                        @RequestParam("userEmail") String userEmail, @RequestParam("userUnit") String userUnit,
                        Model model) {
        return userService.logon(userName, userEnName, userPsw, userPhone, userEmail, userUnit, model);
    }
}
