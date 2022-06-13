package com.Groep3.Management.Entities;

import javax.persistence.*;



public class Order {
    private Integer id;

    private Integer tableId;

    private Integer orderState = 0;

    long time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderState() {
        return this.orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer TableId) {
        tableId = TableId;
    }
}