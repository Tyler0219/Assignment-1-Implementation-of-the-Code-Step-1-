package com.unit6.springbootunit6.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.unit6.springbootunit6.Entity.orders;
import com.unit6.springbootunit6.repository.ordersRepository;

@Service
public class orderService {
    @Autowired
    private ordersRepository repository;
    
    // Create a new order
    public orders saveOrder(orders order) {
        return repository.save(order);
    }
    
    // Read an existing order by ID
    public Optional<orders> getOrderById(int orderId) {
        return repository.findById(orderId);
    }
    
    // Update an existing order
    public orders updateOrder(int orderId, orders updatedOrder) {
        Optional<orders> existingOrderOptional = repository.findById(orderId);
        if (existingOrderOptional.isPresent()) {
            updatedOrder.setOrder_id(orderId);
            return repository.save(updatedOrder);
        } else {
            return null; // Handle not found case
        }
    }
    
    // Delete an existing order
    public void deleteOrder(int orderId) {
        repository.deleteById(orderId);
    }
    
    // Get all orders
    public List<orders> getAllOrders() {
        return repository.findAll();
    }
}
