package com.example.demo.service;

import com.example.demo.DTO.CustomerDto;
import com.example.demo.model.Customer;

public interface CustomerService {
    public Customer getCustomer(int customerId);
    public void deleteCustomer(int customerId);
    public Customer createCustomer(CustomerDto customerDto);
}
