package com.example.demo.repository.impl;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public Customer createCustomer(Customer customer) {
        this.customers.add(customer);
        return customer;
    }

    @Override
    public void deleteCustomer(Customer customer) {
        this.customers.remove(customer);
    }

    @Override
    public Customer getCustomer(int customerId) {
        return this.customers.stream()
                .filter(customer -> customer.getId() == customerId)
                .findFirst()
                //.orElseThrow(() -> new RuntimeException("Customer not found with ID: " + customerId));
                .orElse(null);
    }

    @Override
    public List<Customer> getCustomers() {
        return this.customers;
    }
}
