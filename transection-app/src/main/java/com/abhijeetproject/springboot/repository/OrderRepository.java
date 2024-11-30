package com.abhijeetproject.springboot.repository;

import com.abhijeetproject.springboot.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
