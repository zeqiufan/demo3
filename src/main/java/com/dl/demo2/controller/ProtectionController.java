package com.dl.demo2.controller;

import com.dl.demo2.model.CompositeKey;
import com.dl.demo2.model.Protection;
import com.dl.demo2.service.ProtectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProtectionController {

    @Autowired
    private ProtectionService protectionService;

    @GetMapping(value = "/api/protection/profile")
    public List<Protection> getProtections(@RequestParam("devId") Long devId) {
        return protectionService.getProtectionsByDevId(devId);
    }

    @PostMapping(value = "/api/protection/solidify")
    public void protectionSolidify(@RequestParam("devId") Long devId) {
        protectionService.protectionSolidify(devId);
    }

    @PostMapping(value = "/api/protection/modify")
    public void protectionModify(@RequestParam("devId") Long devId, @RequestParam("indexNo") Integer indexNo,
                                   @RequestParam(value = "modyVal") Float modyVal) {
        protectionService.protectionModify(new CompositeKey(devId, indexNo), modyVal);
    }

    @PostMapping(value = "/api/protection/refresh")
    public String protectionRefresh(@RequestParam("devId") Long devId) {
        protectionService.protectionRefresh(devId);
        return "后台数据库刷新结束";
    }

    @PostMapping(value = "/api/protection/change")
    public void protectionChange(@RequestParam("devId") Long devId) {
        protectionService.protectionChange(devId);
    }

}
