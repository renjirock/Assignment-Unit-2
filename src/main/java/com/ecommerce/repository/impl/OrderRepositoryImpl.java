package com.ecommerce.repository.impl;

import com.ecommerce.model.Order;
import com.ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
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

    @Override
    public List<Order> gerOrders() {
        return this.orders;
    }
}
