package com.ecommerce.DTO;

import com.ecommerce.model.Customer;
import com.ecommerce.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private List<Product> products;
    private Customer customer;
}
