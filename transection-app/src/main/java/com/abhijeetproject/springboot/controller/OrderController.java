package com.abhijeetproject.springboot.controller;

import com.abhijeetproject.springboot.dto.OrderRequest;
import com.abhijeetproject.springboot.dto.OrderResponse;
import com.abhijeetproject.springboot.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<OrderResponse> placeorder(@RequestBody OrderRequest orderRequest){
      return ResponseEntity.ok(orderService.placeOrder(orderRequest));
    }
}
