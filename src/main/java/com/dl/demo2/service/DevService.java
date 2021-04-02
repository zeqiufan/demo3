package com.dl.demo2.service;

import com.dl.demo2.model.Dev;
import com.dl.demo2.repository.DevRepository;
import com.dl.demo2.repository.RelUserDevRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DevService {

    @Autowired
    private DevRepository devRepository;

    @Autowired
    private RelUserDevRepository relUserDevRepository;

    public List<Dev> getDevsByUserId(Long userId) {
        List<Long> devIds = relUserDevRepository.getDevIdsByUserId(userId);
        List<Dev> devs = new ArrayList<>();
        for (Long devId : devIds) {
            devs.add(devRepository.getDevByDevId(devId));
        }
        return devs;
    }

    /**
     * 如果一次获取 dev 的所有信息效率太低
     * 可以改用此函数来仅获取部分信息
     * @param userId
     * @return
     */
    public List<Map<String, Object>> getDevInfos(Long userId) {
        List<Dev> devs = getDevsByUserId(userId);
        List<Map<String, Object>> res = new ArrayList<>();
        Map<String, Object> devInfo = new HashMap<>();
        for (Dev dev : devs) {
            devInfo.put("devName", dev.getDevName());
            devInfo.put("stationName", dev.getStationName());
            devInfo.put("lineName", dev.getLineName());
            res.add(devInfo);
            devInfo.clear();
        }
        return res;
    }

    public Dev changeDev(Long devId, HttpSession session) {
        Dev curDev = devRepository.getDevByDevId(devId);
        session.setAttribute("curDev", curDev);
        return curDev;
    }
}
