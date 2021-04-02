package com.dl.demo2.service;

import com.dl.demo2.model.common.Instruct.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.dl.demo2.model.common.Instruct.*;

@Service
public class RemoteService {

    @Autowired
    private CommandService commandService;

    public void switchOn(Long devId) {
        remoteSwitch(devId, PARAM.SWITCH_ON);
    }

    public void switchOff(Long devId) {
        remoteSwitch(devId, PARAM.SWITCH_OFF);
    }

    private void remoteSwitch(Long devId, Integer param) {
        commandService.instruct(devId, CMD_INDEX_NO, CMD_TYPE_INDEX, CMD_TYPE.SWITCH);
        commandService.instruct(devId, CMD_INDEX_NO, PARAM1, param);
    }
}
