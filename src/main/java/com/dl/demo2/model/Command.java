package com.dl.demo2.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cmd_table")
public class Command {

    @EmbeddedId
    private CompositeKey compositeKey;

    private Integer cmdType;

    private Integer cmdParam1;

    private Integer cmdParam2;

    private Integer cmdParam3;

    private Integer cmdParam4;

    private Integer procTag;

    private Integer warnType;

    private Integer cmdTime;

    public CompositeKey getCompositeKey() {
        return compositeKey;
    }

    public void setCompositeKey(CompositeKey compositeKey) {
        this.compositeKey = compositeKey;
    }

    public Integer getCmdType() {
        return cmdType;
    }

    public void setCmdType(Integer cmdType) {
        this.cmdType = cmdType;
    }

    public Integer getCmdParam1() {
        return cmdParam1;
    }

    public void setCmdParam1(Integer cmdParam1) {
        this.cmdParam1 = cmdParam1;
    }

    public Integer getCmdParam2() {
        return cmdParam2;
    }

    public void setCmdParam2(Integer cmdParam2) {
        this.cmdParam2 = cmdParam2;
    }

    public Integer getCmdParam3() {
        return cmdParam3;
    }

    public void setCmdParam3(Integer cmdParam3) {
        this.cmdParam3 = cmdParam3;
    }

    public Integer getCmdParam4() {
        return cmdParam4;
    }

    public void setCmdParam4(Integer cmdParam4) {
        this.cmdParam4 = cmdParam4;
    }

    public Integer getProcTag() {
        return procTag;
    }

    public void setProcTag(Integer procTag) {
        this.procTag = procTag;
    }

    public Integer getWarnType() {
        return warnType;
    }

    public void setWarnType(Integer warnType) {
        this.warnType = warnType;
    }

    public Integer getCmdTime() {
        return cmdTime;
    }

    public void setCmdTime(Integer cmdTime) {
        this.cmdTime = cmdTime;
    }
}
