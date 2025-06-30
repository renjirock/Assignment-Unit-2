package com.ecommerce.service;

import com.ecommerce.DTO.OrderDto;
import com.ecommerce.model.Order;

public interface OrderService {
    public Order createOrder(OrderDto order);
    public Order getOrder(int orderId);
    public void deleteOrder(int orderId);
    public Order updateOrder(int orderId, OrderDto order);
}
