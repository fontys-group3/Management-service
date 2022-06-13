package com.Groep3.Management.Entities;

import java.time.Instant;

import javax.persistence.*;




@Entity
@Table
public class OrderData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer tableId;

    @Column
    private Integer orderState = 0;

    @Column
    long time = Instant.now().getEpochSecond();

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