package com.dl.demo2.service;

import com.dl.demo2.model.CompositeKey;
import com.dl.demo2.model.Protection;
import com.dl.demo2.repository.ProtectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static com.dl.demo2.model.common.Instruct.*;

@Service
public class ProtectionService {


    @Autowired
    private ProtectionRepository protectionRepository;

    @Autowired
    private CommandService commandService;

    public List<Protection> getProtectionsByDevId(Long devId) {
        return protectionRepository.getProtectionsByDevId(devId);
    }

    public void protectionSolidify(Long devId) {
        // 3 表示固化
        commandService.instruct(devId, CMD_INDEX_NO, CMD_TYPE_INDEX, CMD_TYPE.SOLIDIFY);
    }

    public void protectionModify(CompositeKey id, Float modyVal) {
        Protection protection = protectionRepository.getProtectionByDevIdAndIndexNo(id.getDevId(), id.getIndexNo());
        protection.setModyTime(Integer.valueOf(String.valueOf(new Date().getTime()).substring(0, 10)));
        protection.setModyVal(modyVal);
        protection.setModyFlag(1);
        protectionRepository.save(protection);
    }

    public void protectionRefresh(Long devId) {
        // 1 表示刷新
        commandService.instruct(devId, CMD_INDEX_NO, CMD_TYPE_INDEX, CMD_TYPE.REFRESH);
    }

    public void protectionChange(Long devId) {
        // 2 表示修改
        commandService.instruct(devId, CMD_INDEX_NO, CMD_TYPE_INDEX, CMD_TYPE.CHANGE);
    }
}
