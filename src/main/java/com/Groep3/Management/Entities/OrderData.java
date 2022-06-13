package com.Groep3.Management.Entities;

import java.time.Instant;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table
public class OrderData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer tableId;

    @Column
    private Integer orderState = 0;

    @Column
    long startTime;

    @Column
    long assignTime;

    @Column
    long finishTime;

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

    public long getStartTime() {
        return this.startTime;
    }

    public void setStartTime(long time) {
        this.startTime = time;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer TableId) {
        tableId = TableId;
    }

    public long getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(long assignTime) {
        this.assignTime = assignTime;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
    }
}
