package com.abhijeetproject.springboot.repository;

import com.abhijeetproject.springboot.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
