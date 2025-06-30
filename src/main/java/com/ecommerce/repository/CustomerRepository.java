package com.ecommerce.repository;

import com.ecommerce.model.Customer;

import java.util.List;

public interface CustomerRepository {
    public Customer createCustomer(Customer customer);
    public void deleteCustomer (Customer customer);
    public Customer getCustomer (int customerId);
    public List<Customer> getCustomers();
}
