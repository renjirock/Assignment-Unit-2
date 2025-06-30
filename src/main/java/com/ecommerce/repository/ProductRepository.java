package com.ecommerce.repository;

import com.ecommerce.model.Product;

import java.util.List;

public interface ProductRepository {
    public Product saveProduct(Product product);
    public void deleteProduct(Product product);
    public Product getProduct(int productId);
    public List<Product> getProducts();
}
