package cn.bclearn.mitopoolweb.dao.entity;

import java.util.List;

public class Blog {
    private Integer iht;
    private String isrc;
    private String msg;

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getIht() {
        return iht;
    }

    public void setIht(Integer iht) {
        this.iht = iht;
    }
}
