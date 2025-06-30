package com.ecommerce.repository;

import com.ecommerce.model.Order;

import java.util.List;

public interface OrderRepository {
    public Order createOrder (Order order);
    public void deleteOrder (Order order);
    public Order getOrder (int orderId);
    public List<Order> gerOrders();
}
