package com.dl.demo2.controller;

import com.dl.demo2.model.Communication;
import com.dl.demo2.service.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CommunicationController {

    @Autowired
    private CommunicationService communicationService;

    @GetMapping(value = "/api/communication/profile")
    public List<Communication> getCommunications(@RequestParam("devId") Long devId) {
        return communicationService.getCommunicationsByDevId(devId);
    }

    @GetMapping(value = "/api/communication/imageCode")
    public Integer getImageCode(@RequestParam("devId") Long devId) {
        return communicationService.getImageCode(devId);
    }

    @GetMapping(value = "/api/communication/communicationStatusCode")
    public Integer getCommunicationStatusCode(@RequestParam("devId") Long devId) {
        return communicationService.getCommunicationStatusCode(devId);
    }

    @GetMapping(value = "/api/communication/circleCode")
    public Map<String, Integer> getCircleCode(@RequestParam("devId") Long devId) {
        return communicationService.getCircleCode(devId);
    }

}
