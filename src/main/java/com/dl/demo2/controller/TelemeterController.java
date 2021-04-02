package com.dl.demo2.controller;

import com.dl.demo2.model.Telemeter;
import com.dl.demo2.service.CommunicationService;
import com.dl.demo2.service.TelemeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 遥测Controller
 * 负责与telemeter.html进行通信
  */
@RestController
public class TelemeterController {

    // 注入TelemeterService依赖
    @Autowired
    private TelemeterService telemeterService;

    /**
     * 获取某 dev 的所遥测数据
     * @param devId
     * @return
     */
    @GetMapping(value = "/api/telemeter/profile")
    public List<Telemeter> getTelemeters(@RequestParam("devId") Long devId) {
        return telemeterService.getTelemetersByDevId(devId);
    }

    /**
     * 获取某 dev 的 电流、电压 数据
     * 用于通信状态的展示
     * @param devId
     * @return
     */
    @GetMapping(value = "/api/telemeter/status")
    public Map<String, Object> getTelemeterStatus(@RequestParam("devId") Long devId) {
        return telemeterService.getTelemeterStatus(devId);
    }
}
