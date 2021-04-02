package com.dl.demo2.model;

import javax.persistence.*;

@Entity
@Table(name = "dev_table")
public class Dev {

    @Id
    @Column(name = "dev_ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long devId;

    @Column(name = "com_id")
    private Integer comId;

    private String devName;

    private String devEnName;

    private String stationName;

    private String lineName;

    private String cabeName;

    private String province;

    private String city;

    private String county;

    private String installunit;

    private Integer installTime;

    private String installman1;

    private String installphone1;

    private String installman2;

    private String installphone2;

    private String installman3;

    private String installphone3;

    private String installman4;

    private String installphone4;

    private String installman5;

    private String installphone5;

    private String installman6;

    private String installphone6;

    private String clmReserve1;

    private String clmReserve2;

    private String clmReserve3;

    public Long getDevId() {
        return devId;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public void setDevId(Long devId) {
        this.devId = devId;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getDevEnName() {
        return devEnName;
    }

    public void setDevEnName(String devEnName) {
        this.devEnName = devEnName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getCabeName() {
        return cabeName;
    }

    public void setCabeName(String cabeName) {
        this.cabeName = cabeName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getInstallunit() {
        return installunit;
    }

    public void setInstallunit(String installunit) {
        this.installunit = installunit;
    }

    public Integer getInstallTime() {
        return installTime;
    }

    public void setInstallTime(Integer installTime) {
        this.installTime = installTime;
    }

    public String getInstallman1() {
        return installman1;
    }

    public void setInstallman1(String installman1) {
        this.installman1 = installman1;
    }

    public String getInstallphone1() {
        return installphone1;
    }

    public void setInstallphone1(String installphone1) {
        this.installphone1 = installphone1;
    }

    public String getInstallman2() {
        return installman2;
    }

    public void setInstallman2(String installman2) {
        this.installman2 = installman2;
    }

    public String getInstallphone2() {
        return installphone2;
    }

    public void setInstallphone2(String installphone2) {
        this.installphone2 = installphone2;
    }

    public String getInstallman3() {
        return installman3;
    }

    public void setInstallman3(String installman3) {
        this.installman3 = installman3;
    }

    public String getInstallphone3() {
        return installphone3;
    }

    public void setInstallphone3(String installphone3) {
        this.installphone3 = installphone3;
    }

    public String getInstallman4() {
        return installman4;
    }

    public void setInstallman4(String installman4) {
        this.installman4 = installman4;
    }

    public String getInstallphone4() {
        return installphone4;
    }

    public void setInstallphone4(String installphone4) {
        this.installphone4 = installphone4;
    }

    public String getInstallman5() {
        return installman5;
    }

    public void setInstallman5(String installman5) {
        this.installman5 = installman5;
    }

    public String getInstallphone5() {
        return installphone5;
    }

    public void setInstallphone5(String installphone5) {
        this.installphone5 = installphone5;
    }

    public String getInstallman6() {
        return installman6;
    }

    public void setInstallman6(String installman6) {
        this.installman6 = installman6;
    }

    public String getInstallphone6() {
        return installphone6;
    }

    public void setInstallphone6(String installphone6) {
        this.installphone6 = installphone6;
    }

    public String getClmReserve1() {
        return clmReserve1;
    }

    public void setClmReserve1(String clmReserve1) {
        this.clmReserve1 = clmReserve1;
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
