package com.leo.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leo.springcloud.entity.ProductCateGoryEntity;

public interface ProductCategoryRepository extends JpaRepository<ProductCateGoryEntity, Integer> {

}
