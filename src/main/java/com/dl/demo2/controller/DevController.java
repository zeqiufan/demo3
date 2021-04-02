package com.dl.demo2.controller;

import com.dl.demo2.model.Dev;
import com.dl.demo2.service.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class DevController {

    @Autowired
    private DevService devService;

    @GetMapping(value = "/api/dev/profile")
    public List<Dev> getDevs(@RequestParam("userId") Long userId) {
        return devService.getDevsByUserId(userId);
    }

    /**
     * 改变 session 里的 curDev，并返回当前 dev
     */
    @GetMapping(value = "/api/dev/changeCurDev")
    public Dev changeDev(@RequestParam("devId") Long devId, HttpSession session) {
        return devService.changeDev(devId, session);
    }
}
