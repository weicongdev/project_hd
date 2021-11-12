package com.rng.demo.pojo;

public class AvgPvNum {
    private int id;
    private String dataStr;
    private Float avgPvNum;

    public AvgPvNum() {
    }

    public AvgPvNum(int id, String dataStr, Float avgPvNum) {
        this.id = id;
        this.dataStr = dataStr;
        this.avgPvNum = avgPvNum;
    }

    @Override
    public String toString() {
        return "AvgpvNum{" +
                "id=" + id +
                ", dataStr='" + dataStr + '\'' +
                ", avgPvNum=" + avgPvNum +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataStr() {
        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = dataStr;
    }

    public Float getAvgPvNum() {
        return avgPvNum;
    }

    public void setAvgPvNum(Float avgPvNum) {
        this.avgPvNum = avgPvNum;
    }
}
