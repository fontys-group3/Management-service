package com.Groep3.Management.Entities;

import javax.persistence.Column;
import java.time.Instant;

public class Order {
    private Integer tableId;

    private Integer orderState = 0;

    long time = Instant.now().getEpochSecond();

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
