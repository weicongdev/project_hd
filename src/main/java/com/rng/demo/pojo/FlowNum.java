package com.rng.demo.pojo;

public class FlowNum {

    private Integer id;
    private String dateStr;
    private Integer pVNum;
    private Integer uVnum;
    private Integer iPNum;
    private Integer newUvNum;
    private Integer visitNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public Integer getpVNum() {
        return pVNum;
    }

    public void setpVNum(Integer pVNum) {
        this.pVNum = pVNum;
    }

    public Integer getuVnum() {
        return uVnum;
    }

    public void setuVnum(Integer uVnum) {
        this.uVnum = uVnum;
    }

    public Integer getiPNum() {
        return iPNum;
    }

    public void setiPNum(Integer iPNum) {
        this.iPNum = iPNum;
    }

    public Integer getNewUvNum() {
        return newUvNum;
    }

    public void setNewUvNum(Integer newUvNum) {
        this.newUvNum = newUvNum;
    }

    public Integer getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(Integer visitNum) {
        this.visitNum = visitNum;
    }

    @Override
    public String toString() {
        return "FlowNum{" +
                "id=" + id +
                ", dateStr='" + dateStr + '\'' +
                ", pVNum=" + pVNum +
                ", uVnum=" + uVnum +
                ", iPNum=" + iPNum +
                ", newUvNum=" + newUvNum +
                ", visitNum=" + visitNum +
                '}';
    }
}
