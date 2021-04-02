package com.dl.demo2.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * 因为很多表使用了双主键
 * 这里将多主键dev_id、indexNo封装为一个CompositeKey类
 */
@Embeddable
public class CompositeKey implements Serializable {

    static final long serialVersionUID = -6568705953212064116L;

    @Column(name = "dev_id")
    private Long devId;

    @Column(name = "IndexNo")
    private Integer indexNo;

    public CompositeKey() {}

    public CompositeKey(Long devId, Integer indexNo) {
        this.devId = devId;
        this.indexNo = indexNo;
    }

    public Long getDevId() {
        return devId;
    }

    public void setDevId(Long devId) {
        this.devId = devId;
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }
}
