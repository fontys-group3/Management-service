package com.Groep3.Management.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Groep3.Management.Entities.OrderData;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDataRepository extends JpaRepository<OrderData, Integer> {
}