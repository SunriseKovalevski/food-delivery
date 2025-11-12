package com.innowise.kovalevski_vv.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping
    public String getOrders() {
        return "Orders list from Order Service";
    }

    @PostMapping
    public String createOrder() {
        return "Order created";
    }

    @GetMapping("/{id}")
    public String getOrder(@PathVariable String id) {
        return "Order with id: " + id;
    }
}
