package com.dl.demo2.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "devuser_table")
@IdClass(RelUserDev.class)
public class RelUserDev implements Serializable {

    static final long serialVersionUID = -6314087037090048072L;

    @Id
    @Column(name = "user_ID")
    private Long userId;

    @Id
    @Column(name = "dev_ID")
    private Long devId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDevId() {
        return devId;
    }

    public void setDevId(Long devId) {
        this.devId = devId;
    }
}
