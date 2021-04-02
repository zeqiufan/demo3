package com.dl.demo2.model;

import javax.persistence.*;

/**
 * 遥测的Model类
 * @Entity 表示这是一个Model类
 * @Table(name = "yc_table") 表示这个类在数据库中对应的表是yc_table
 */
@Entity
@Table(name = "yc_table")
public class Telemeter {

    // 表明这是一个复合主键
    @EmbeddedId
    private CompositeKey compositeKey;

    @Column(name = "ycName")
    private String ycName;

    @Column(name = "ycEnName")
    private String ycEnName;

    @Column(name = "ycunit")
    private String ycunit;

    @Column(name = "ycType")
    private Integer ycType;

    @Column(name = "ycVal")
    private Float ycVal;

    @Column(name = "minVal")
    private Float minVal;

    @Column(name = "maxVal")
    private Float maxVal;

    @Column(name = "zeroVal")
    private Float zeroVal;

    @Column(name = "cngVal")
    private Float cngVal;

    @Column(name = "procTag")
    private Integer procTag;

    @Column(name = "warnType")
    private Integer warnType;

    public com.dl.demo2.model.CompositeKey getCompositeKey() {
        return compositeKey;
    }

    public void setCompositeKey(com.dl.demo2.model.CompositeKey compositeKey) {
        this.compositeKey = compositeKey;
    }

    public String getYcName() {
        return ycName;
    }

    public void setYcName(String ycName) {
        this.ycName = ycName;
    }

    public String getYcEnName() {
        return ycEnName;
    }

    public void setYcEnName(String ycEnName) {
        this.ycEnName = ycEnName;
    }

    public String getYcunit() {
        return ycunit;
    }

    public void setYcunit(String ycunit) {
        this.ycunit = ycunit;
    }

    public Integer getYcType() {
        return ycType;
    }

    public void setYcType(Integer ycType) {
        this.ycType = ycType;
    }

    public Float getYcVal() {
        return ycVal;
    }

    public void setYcVal(Float ycVal) {
        this.ycVal = ycVal;
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

    public Float getZeroVal() {
        return zeroVal;
    }

    public void setZeroVal(Float zeroVal) {
        this.zeroVal = zeroVal;
    }

    public Float getCngVal() {
        return cngVal;
    }

    public void setCngVal(Float cngVal) {
        this.cngVal = cngVal;
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