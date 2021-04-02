package com.dl.demo2.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {

    @Id
    @Column(name = "user_ID")
    private Long userId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "userEnName")
    private String userEnName;

    @Column(name = "userPhone")
    private String userPhone;

    @Column(name = "userEmail")
    private String userEmail;

    @Column(name = "userPsw")
    private String userPsw;

    @Column(name = "userType")
    private Integer userType;

    @Column(name = "userYkType")
    private Integer userYkType;

    @Column(name = "clmReserve1")
    private String userUnit;

    @Column(name = "clmReserve2")
    private String clmReserve2;

    @Column(name = "clmReserve3")
    private String clmReserve3;
    
    public User() {}
    
    public User(String userName, String userEnName, String userPsw, String userPhone, String userEmail, String userUnit) {
        this.userName = userName;
        this.userEnName = userEnName;
        this.userPsw = userPsw;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userUnit = userUnit;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEnName() {
        return userEnName;
    }

    public void setUserEnName(String userEnName) {
        this.userEnName = userEnName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserYkType() {
        return userYkType;
    }

    public void setUserYkType(Integer userYkType) {
        this.userYkType = userYkType;
    }

    public String getUserUnit() {
        return userUnit;
    }

    public void setUserUnit(String userUnit) {
        this.userUnit = userUnit;
    }

    public String getClmReserve2() {
        return clmReserve2;
    }

    public void setClmReserve2(String clmReserve2) {
        this.clmReserve2 = clmReserve2;
    }

    public String getClmReserve3() {
        return clmReserve3;
    }

    public void setClmReserve3(String clmReserve3) {
        this.clmReserve3 = clmReserve3;
    }
}
