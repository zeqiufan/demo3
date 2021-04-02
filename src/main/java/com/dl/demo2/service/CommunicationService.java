package com.dl.demo2.service;

import com.dl.demo2.model.Communication;
import com.dl.demo2.repository.CommunicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommunicationService {

    private static final Integer IMAGE_CODE_INDEX_NO = 17;

    private static final Integer COMMUNICATION_STATUS_CODE_INDEX_NO = 16;

    private static final Integer ALARM_CODE_INDEX_NO = 12;

    private static final Integer FAULT_CODE_INDEX_NO = 13;

    @Autowired
    private CommunicationRepository communicationRepository;

    public List<Communication> getCommunicationsByDevId(Long devId) {
        return communicationRepository.getCommunicationsByDevId(devId);
    }

    public Integer getImageCode(Long devId) {
        Communication communication = communicationRepository.getCommunicationByDevIdAAndIndexNo(devId, IMAGE_CODE_INDEX_NO);
        return communication.getYxVal();
    }

    public Integer getCommunicationStatusCode(Long devId) {
        Communication communication = communicationRepository.getCommunicationByDevIdAAndIndexNo(devId, COMMUNICATION_STATUS_CODE_INDEX_NO);
        return communication.getYxVal();
    }


    public Map<String, Integer> getCircleCode(Long devId) {
        Map<String, Integer> circleCodes = new HashMap<>();
        circleCodes.put("yellowCircleCode",
                communicationRepository.getCommunicationByDevIdAAndIndexNo(devId, ALARM_CODE_INDEX_NO).getYxVal());
        circleCodes.put("redCircleCode",
                communicationRepository.getCommunicationByDevIdAAndIndexNo(devId, FAULT_CODE_INDEX_NO).getYxVal());
        return circleCodes;
    }
}
