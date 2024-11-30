package com.abhijeetproject.springboot.dto;

import com.abhijeetproject.springboot.entity.Order;
import com.abhijeetproject.springboot.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
