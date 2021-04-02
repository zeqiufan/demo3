package com.dl.demo2.controller;

import com.dl.demo2.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteController {

    @Autowired
    private RemoteService remoteService;

    @PostMapping(value = "/api/remote/switchOn")
    public void switchOn(@RequestParam("devId") Long devId) {
        remoteService.switchOn(devId);
    }

    @PostMapping(value = "/api/remote/switchOff")
    public void switchOff(@RequestParam("devId") Long devId) {
        remoteService.switchOff(devId);
    }

}
