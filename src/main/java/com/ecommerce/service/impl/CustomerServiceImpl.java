package com.ecommerce.service.impl;

import com.ecommerce.DTO.CustomerDto;
import com.ecommerce.model.Customer;
import com.ecommerce.repository.CustomerRepository;
import com.ecommerce.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer getCustomer(int customerId) {
        Customer customer = customerRepository.getCustomer(customerId);
        if (customer != null){
            return customer;
        } else {
            throw new RuntimeException("Customer not found with ID: " + customerId);
        }
    }

    @Override
    public void deleteCustomer(int customerId) {
        Customer customer = customerRepository.getCustomer(customerId);
        if (customer != null){
            customerRepository.deleteCustomer(customer);
        } else {
            throw new RuntimeException("Customer not found with ID: " + customerId);
        }
    }

    @Override
    public Customer createCustomer(CustomerDto customer) {
        Customer newCustomer = new Customer(
                customerRepository.getCustomers().size(),
                customer.getName()
        );
        return customerRepository.createCustomer(newCustomer);
    }
}
