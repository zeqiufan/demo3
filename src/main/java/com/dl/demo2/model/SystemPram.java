package com.dl.demo2.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "syspram_table")
public class SystemPram implements Serializable {

    static final long serialVersionUID = -3366850477960231992L;

    @Column(name = "user_IDcount")
    private Long userIdCount;

    @Column(name = "dev_IDcount")
    private Long devIdCount;

    @Id
    private String compName;

    public Long getUserIdCount() {
        return userIdCount;
    }

    public void setUserIdCount(Long userIdCount) {
        this.userIdCount = userIdCount;
    }

    public Long getDevIdCount() {
        return devIdCount;
    }

    public void setDevIdCount(Long devIdCount) {
        this.devIdCount = devIdCount;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }
}
