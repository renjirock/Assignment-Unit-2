package com.ecommerce.service;

import com.ecommerce.DTO.CustomerDto;
import com.ecommerce.model.Customer;

public interface CustomerService {
    public Customer getCustomer(int customerId);
    public void deleteCustomer(int customerId);
    public Customer createCustomer(CustomerDto customerDto);
}
