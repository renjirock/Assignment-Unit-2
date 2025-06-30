package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CustomerRepository {
    public Customer createCustomer(Customer customer);
    public void deleteCustomer (Customer customer);
    public Customer getCustomer (int customerId);
    public List<Customer> getCustomers();
}
