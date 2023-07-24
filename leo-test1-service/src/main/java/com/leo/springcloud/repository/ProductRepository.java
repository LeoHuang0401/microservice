package com.leo.springcloud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leo.springcloud.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{

    List<ProductEntity> findByProductCategoryId(Integer productCategoryId);
}
