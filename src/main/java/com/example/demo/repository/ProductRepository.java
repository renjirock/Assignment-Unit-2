package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository {
    public Product saveProduct(Product product);
    public void deleteProduct(Product product);
    public Product getProduct(int productId);
}
