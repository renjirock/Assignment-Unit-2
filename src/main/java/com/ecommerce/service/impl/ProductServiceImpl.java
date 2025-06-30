package com.ecommerce.service.impl;

import com.ecommerce.DTO.ProductDto;
import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(ProductDto product) {
        Product newProduct = new Product(
                productRepository.getProducts().size(),
                product.getName(),
                product.getPrice()
        );
        return productRepository.saveProduct(newProduct);
    }

    @Override
    public void deleteProduct(int productId) {
        Product product = productRepository.getProduct(productId);
        if (product != null){
            productRepository.deleteProduct(product);
        } else {
            throw new RuntimeException("Product not found with ID: " + productId);
        }
    }

    @Override
    public Product getProduct(int productId) {
        Product product = productRepository.getProduct(productId);
        if (product != null){
            return product;
        } else {
            throw new RuntimeException("Product not found with ID: " + productId);
        }
    }
}
