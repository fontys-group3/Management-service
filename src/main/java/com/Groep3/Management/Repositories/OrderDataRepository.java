package com.Groep3.Management.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.Groep3.Management.Entities.OrderData;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDataRepository extends JpaRepository<OrderData, Integer> {
    @Query(value = "SELECT * FROM order_data WHERE table_Id = :id ;", nativeQuery = true)
    public OrderData getByTableId(@Param("id") Integer tableId);
}