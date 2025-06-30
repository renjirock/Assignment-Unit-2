package com.example.demo.repository;

import com.example.demo.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository {
    public Order createOrder (Order order);
    public void deleteOrder (Order order);
    public Order getOrder (int orderId);
}
