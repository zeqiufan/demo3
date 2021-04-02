package com.dl.demo2.service;

import com.dl.demo2.model.Telemeter;
import com.dl.demo2.repository.TelemeterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 遥测Service
 * 主要实现遥测相关的业务逻辑
 */
@Service
public class TelemeterService {

    // 定义电流电压在数据库中对应的indexNo值
    private static final Integer VOLTAGE_INDEX_NO = 0;
    private static final Integer CURRENT_INDEX_NO = 1;

    // 注入TelemeterRepository依赖，可以理解为new了一个名为telemeterRepository的TelemeterRepository对象
    @Autowired
    private TelemeterRepository telemeterRepository;

    public List<Telemeter> getTelemetersByDevId(Long devId) {
        return telemeterRepository.getTelemetersByDevId(devId);
    }

    public Map<String, Object> getTelemeterStatus(Long devId) {
        Map<String, Object> res = new HashMap<>();
        List<Telemeter> telemeters = telemeterRepository.getTwoTelemetersByDevIdAndIndexNos(devId, VOLTAGE_INDEX_NO, CURRENT_INDEX_NO);
        res.put("voltage", telemeters.get(0).getYcVal());
        res.put("current", telemeters.get(1).getYcVal());
        return res;

    }
}
