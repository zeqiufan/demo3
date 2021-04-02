package com.dl.demo2.service;

import com.dl.demo2.model.Command;
import com.dl.demo2.model.CompositeKey;
import com.dl.demo2.repository.CommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandService {

    @Autowired
    private CommandRepository commandRepository;

    /**
     * 根据 devId 和 indexNo 检索到 cmd_table 的某一条记录
     * 再根据 cmdIndex 将该记录的某个字段值置为 cmdVal
     * @param devId
     * @param indexNo
     * @param cmdIndex 0: cmdType; 1: cmdParam1; 2: cmdParam2; 3: cmdParam3; 4: cmdParam4
     * @param cmdVal
     */
    public void instruct(Long devId, Integer indexNo, Integer cmdIndex, Integer cmdVal) {
        Command command = commandRepository.getCommandByDevIdAndIndexNo(devId, indexNo);

        switch (cmdIndex) {
            case 0:
                command.setCmdType(cmdVal);
                break;
            case 1:
                command.setCmdParam1(cmdVal);
                break;
            case 2:
                command.setCmdParam2(cmdVal);
                break;
            case 3:
                command.setCmdParam3(cmdVal);
                break;
            case 4:
                command.setCmdParam4(cmdVal);
                break;
        }

        commandRepository.save(command);
    }

}
