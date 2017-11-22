package com.goal.po;

import java.util.Date;

public class OrderCmd {
    private String id;

    private String orderId;

    private String cmdId;

    private String cmdSpecId;

    private String cmdPrice;

    private String cmdCount;

    private Date changeTsp;

    private Date createTsp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getCmdId() {
        return cmdId;
    }

    public void setCmdId(String cmdId) {
        this.cmdId = cmdId == null ? null : cmdId.trim();
    }

    public String getCmdSpecId() {
        return cmdSpecId;
    }

    public void setCmdSpecId(String cmdSpecId) {
        this.cmdSpecId = cmdSpecId == null ? null : cmdSpecId.trim();
    }

    public String getCmdPrice() {
        return cmdPrice;
    }

    public void setCmdPrice(String cmdPrice) {
        this.cmdPrice = cmdPrice == null ? null : cmdPrice.trim();
    }

    public String getCmdCount() {
        return cmdCount;
    }

    public void setCmdCount(String cmdCount) {
        this.cmdCount = cmdCount == null ? null : cmdCount.trim();
    }

    public Date getChangeTsp() {
        return changeTsp;
    }

    public void setChangeTsp(Date changeTsp) {
        this.changeTsp = changeTsp;
    }

    public Date getCreateTsp() {
        return createTsp;
    }

    public void setCreateTsp(Date createTsp) {
        this.createTsp = createTsp;
    }
}