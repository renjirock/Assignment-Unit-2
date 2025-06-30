package com.ecommerce.service;

import com.ecommerce.DTO.ProductDto;
import com.ecommerce.model.Product;

public interface ProductService {
    public Product createProduct(ProductDto product);
    public void deleteProduct(int productId);
    public Product getProduct(int productId);
}
