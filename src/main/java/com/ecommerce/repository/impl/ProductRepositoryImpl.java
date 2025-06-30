package com.ecommerce.repository.impl;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
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
        return getProduct;
    }

    @Override
    public List<Product> getProducts() {
        return this.products;
    }
}
