package com.leo.springcloud.vo;

import java.util.ArrayList;
import java.util.List;

import com.leo.springcloud.entity.ProductEntity;

public class ProductsVo {

    private Integer productCategoryId;
    
    private String productCategoryName;
    
    private List<ProductEntity> product = new ArrayList<>();

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public List<ProductEntity> getProduct() {
        return product;
    }

    public void setProduct(List<ProductEntity> product) {
        this.product = product;
    }
    
}
