package com.rng.demo.pojo;

import java.util.List;

public class FlowNumReturnPojo {
    private List<String> dateStrList;
    private List<String> pVNumList;
    private List<String> uVNumList;
    private List<String> iPNumList;
    private List<String> newUvNumList;
    private List<String> visitNumList;

    public FlowNumReturnPojo() {
    }

    public FlowNumReturnPojo(List<String> dateStrList, List<String> pVNumList, List<String> uVNumList, List<String> iPNumList, List<String> newUvNumList, List<String> visitNumList) {
        this.dateStrList = dateStrList;
        this.pVNumList = pVNumList;
        this.uVNumList = uVNumList;
        this.iPNumList = iPNumList;
        this.newUvNumList = newUvNumList;
        this.visitNumList = visitNumList;
    }

    public List<String> getDateStrList() {
        return dateStrList;
    }

    public void setDateStrList(List<String> dateStrList) {
        this.dateStrList = dateStrList;
    }

    public List<String> getpVNumList() {
        return pVNumList;
    }

    public void setpVNumList(List<String> pVNumList) {
        this.pVNumList = pVNumList;
    }

    public List<String> getuVNumList() {
        return uVNumList;
    }

    public void setuVNumList(List<String> uVNumList) {
        this.uVNumList = uVNumList;
    }

    public List<String> getiPNumList() {
        return iPNumList;
    }

    public void setiPNumList(List<String> iPNumList) {
        this.iPNumList = iPNumList;
    }

    public List<String> getNewUvNumList() {
        return newUvNumList;
    }

    public void setNewUvNumList(List<String> newUvNumList) {
        this.newUvNumList = newUvNumList;
    }

    public List<String> getVisitNumList() {
        return visitNumList;
    }

    public void setVisitNumList(List<String> visitNumList) {
        this.visitNumList = visitNumList;
    }

    @Override
    public String toString() {
        return "FlowNumReturnPojo{" +
                "dateStrList=" + dateStrList +
                ", pVNumList=" + pVNumList +
                ", uVNumList=" + uVNumList +
                ", iPNumList=" + iPNumList +
                ", newUvNumList=" + newUvNumList +
                ", visitNumList=" + visitNumList +
                '}';
    }
}
