package com.abhijeetproject.springboot.service;

import com.abhijeetproject.springboot.dto.OrderRequest;
import com.abhijeetproject.springboot.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
