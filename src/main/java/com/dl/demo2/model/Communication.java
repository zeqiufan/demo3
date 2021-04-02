package com.dl.demo2.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "yx_table")
public class Communication {

    @EmbeddedId
    private CompositeKey compositeKey;

    private String yxName;

    private String yxEnName;

    private Integer yxType;

    private Integer yxVal;

    private Integer procTag;

    private Integer warnType;

    public CompositeKey getCompositeKey() {
        return compositeKey;
    }

    public void setCompositeKey(CompositeKey compositeKey) {
        this.compositeKey = compositeKey;
    }

    public String getYxName() {
        return yxName;
    }

    public void setYxName(String yxName) {
        this.yxName = yxName;
    }

    public String getYxEnName() {
        return yxEnName;
    }

    public void setYxEnName(String yxEnName) {
        this.yxEnName = yxEnName;
    }

    public Integer getYxType() {
        return yxType;
    }

    public void setYxType(Integer yxType) {
        this.yxType = yxType;
    }

    public Integer getYxVal() {
        return yxVal;
    }

    public void setYxVal(Integer yxVal) {
        this.yxVal = yxVal;
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
}
