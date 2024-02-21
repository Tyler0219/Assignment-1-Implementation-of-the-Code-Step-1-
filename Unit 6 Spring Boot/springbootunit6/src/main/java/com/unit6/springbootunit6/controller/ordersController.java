package com.unit6.springbootunit6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.unit6.springbootunit6.Entity.orders;
import com.unit6.springbootunit6.Service.orderService;

@RestController
@RequestMapping("/orders")
public class ordersController {
    @Autowired
    private orderService service;

    @PostMapping("/create")
    public orders createOrder(@RequestBody orders order) {
        return service.saveOrder(order);
    }

    @GetMapping("/{orderId}")
    public Optional<orders> getOrderById(@PathVariable int orderId) {
        return service.getOrderById(orderId);
    }

    @PutMapping("/{orderId}")
    public orders updateOrder(@PathVariable int orderId, @RequestBody orders updatedOrder) {
        return service.updateOrder(orderId, updatedOrder);
    }

    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable int orderId) {
        service.deleteOrder(orderId);
    }

    @GetMapping("/all")
    public List<orders> getAllOrders() {
        return service.getAllOrders();
    }
}