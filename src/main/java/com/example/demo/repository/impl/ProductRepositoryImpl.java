package com.example.demo.repository.impl;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private final List<Product> products = new ArrayList<Product>();

    @Override
    public Product saveProduct(Product product) {
        this.products.add(product);
        return product;
    }

    @Override
    public void deleteProduct(Product product) {
        this.products.remove(product);
    }

    @Override
    public Product getProduct(int productId) {
        Product getProduct = this.products.stream()
                .filter(product -> product.getId() == productId)
                .findFirst()
                //.orElseThrow(() -> new RuntimeException("Product not found with ID: " + productId));
                .orElse(null);
        return null;
    }
}
