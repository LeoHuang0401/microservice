package com.leo.springcloud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.springcloud.entity.ProductEntity;
import com.leo.springcloud.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    
    public List<ProductEntity> getAll() {
        return productRepository.findAll();
    }
    
    public List<ProductEntity> findByProductCategoryId(Integer productCategoryId) {
        return productRepository.findByProductCategoryId(productCategoryId);
    }
}
