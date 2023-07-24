package com.leo.springcloud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leo.springcloud.entity.ProductEntity;
import com.leo.springcloud.service.ProductService;
import com.netflix.discovery.converters.Auto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@Tag(name = "商品")
public class Test1Controller {

    @Autowired
    ProductService productService;
    
    @PostMapping("/")
    public String sayHi() {
        return "post hi";
    }
    
    @GetMapping("/")
    @Operation(summary = "取得所有test1", description = "取得所有test1，每次上限 1000 筆")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success",
                    content = {
                            @Content(
                                    mediaType = "application/json"
                            )
                    }),
            @ApiResponse(responseCode = "401", description = "參數錯誤或沒有權限", content = {
                    @Content()
            })
    })
    public String findAll() {
        return "get hi";
    }
    
    
    @GetMapping("/test1/orcl")
    @Operation(summary = "取得product所有資料", description = "取得product所有資料，每次上限 1000 筆")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = ProductEntity.class))
                            )
                    })
    })
    public List<ProductEntity> orclTest() {
        System.out.println("orcl#in");
        return productService.getAll(); 
    }
    
    @GetMapping("/test2/{productCategoryId}")
    public List<ProductEntity> test2totest1(@PathVariable("productCategoryId") Integer productCategoryId) {
        System.out.println("test1 productCategoryId => " + productCategoryId);
        return productService.findByProductCategoryId(productCategoryId);
    }
    
    @RequestMapping("/test2/to1")
    public String say2to1() {
        return "test2 to test1";
    }
}
