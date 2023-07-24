package com.leo.springcloud.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leo.springcloud.entity.ProductEntity;

@FeignClient(name = "leo-test1-service",url = "localhost:8062")
public interface Test1Client {

    @GetMapping("/test2/{productCategoryId}")
    List<ProductEntity> test2totest1(@PathVariable("productCategoryId") Integer productCategoryId);
}
