package com.ecommerce.service.impl;

import com.ecommerce.DTO.OrderDto;
import com.ecommerce.model.Order;
import com.ecommerce.model.Product;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(OrderDto order) {
        Order newOrder = new Order(
                orderRepository.gerOrders().size(),
                order.getProducts(),
                order.getCustomer(),
                this.price(order.getProducts())
        );
        return orderRepository.createOrder(newOrder);
    }

    @Override
    public Order getOrder(int orderId) {
        Order order = orderRepository.getOrder(orderId);
        if (order != null){
            return order;
        } else {
            throw new RuntimeException("Order not found with ID: " + orderId);
        }
    }

    @Override
    public void deleteOrder(int orderId) {
        Order order = orderRepository.getOrder(orderId);
        if (order == null){
            throw new RuntimeException("Order not found with ID: " + orderId);
        }
        orderRepository.deleteOrder(order);
    }

    @Override
    public Order updateOrder(int orderId, OrderDto orderDto) {
        Order order = orderRepository.getOrder(orderId);
        if (order == null){
            throw new RuntimeException("Order not found with ID: " + orderId);
        }
        order.setProducts(orderDto.getProducts());
        order.setCustomer(orderDto.getCustomer());
        order.setTotal(this.price(orderDto.getProducts()));
        return order;
    }

    private double price(List<Product> products){
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
