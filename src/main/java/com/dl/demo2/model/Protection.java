package com.dl.demo2.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "set_table")
public class Protection {

    @EmbeddedId
    private CompositeKey compositeKey;

    private String setName;

    private String setEnName;

    private String setunit;

    private Integer setType;

    private Float setVal;

    private Float minVal;

    private Float maxVal;

    private Integer procTag;

    private Integer warnType;

    private Integer modyTime;

    private Float modyVal;

    private Integer modyFlag;

    public CompositeKey getCompositeKey() {
        return compositeKey;
    }

    public void setCompositeKey(CompositeKey compositeKey) {
        this.compositeKey = compositeKey;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getSetEnName() {
        return setEnName;
    }

    public void setSetEnName(String setEnName) {
        this.setEnName = setEnName;
    }

    public String getSetunit() {
        return setunit;
    }

    public void setSetunit(String setunit) {
        this.setunit = setunit;
    }

    public Integer getSetType() {
        return setType;
    }

    public void setSetType(Integer setType) {
        this.setType = setType;
    }

    public Float getSetVal() {
        return setVal;
    }

    public void setSetVal(Float setVal) {
        this.setVal = setVal;
    }

    public Float getMinVal() {
        return minVal;
    }

    public void setMinVal(Float minVal) {
        this.minVal = minVal;
    }

    public Float getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(Float maxVal) {
        this.maxVal = maxVal;
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

    public Integer getModyTime() {
        return modyTime;
    }

    public void setModyTime(Integer modyTime) {
        this.modyTime = modyTime;
    }

    public Float getModyVal() {
        return modyVal;
    }

    public void setModyVal(Float modyVal) {
        this.modyVal = modyVal;
    }

    public Integer getModyFlag() {
        return modyFlag;
    }

    public void setModyFlag(Integer modyFlag) {
        this.modyFlag = modyFlag;
    }
}
