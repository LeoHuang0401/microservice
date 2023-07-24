package com.leo.springcloud.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leo.springcloud.client.Test1Client;
import com.leo.springcloud.entity.ProductCateGoryEntity;
import com.leo.springcloud.repository.ProductCategoryRepository;
import com.leo.springcloud.vo.ProductsVo;


@RestController
public class Test2Controller {
    
    @Autowired
    ProductCategoryRepository productCategoryRepository;
    
    @Autowired
    Test1Client test1Client;
    
    @PostMapping("/test2hi")
    public String test2Hi() {
        return "test2 hi";
    }
    
    @GetMapping("/test2/product/{productCategoryId}")
    public ProductsVo findById(@PathVariable("productCategoryId") Integer productCategoryId) {
        ProductsVo pv = new ProductsVo();
        Optional<ProductCateGoryEntity> productCateGoryEntity = productCategoryRepository.findById(productCategoryId);
        if(productCateGoryEntity.isPresent()) {
            ProductCateGoryEntity productCategory = productCateGoryEntity.get();
            pv.setProductCategoryId(productCategory.getProductCategoryId());
            pv.setProductCategoryName(productCategory.getProductCategoryName());
            pv.setProduct(test1Client.test2totest1(productCategory.getProductCategoryId()));
        }
        return pv;
    }
}
