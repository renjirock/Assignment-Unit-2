package com.example.demo.repository.impl;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryImpl implements OrderRepository {
    private List<Order> orders = new ArrayList<>();

    @Override
    public Order createOrder(Order order) {
        this.orders.add(order);
        return order;
    }

    @Override
    public void deleteOrder(Order order) {
        this.orders.remove(order);
    }

    @Override
    public Order getOrder(int orderId) {
        return this.orders.stream()
                .filter(order -> order.getId() == orderId)
                .findFirst()
                .orElse(null);
    }
}
