package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Entity.OrderModel;

@Repository
public interface OrderModelRepo extends JpaRepository<OrderModel, Integer> {

}
