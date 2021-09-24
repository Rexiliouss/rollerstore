package com.rollerstore.ecommerce.Dto;

import com.rollerstore.ecommerce.Model.Product;

public class ProductDto {
    private long id;
    private String productName;
    private String productQuantityPerUnit;
    private long unitsInStock;

    public ProductDto(){}
    public ProductDto(Product from){
        productName=from.getProductName();
        productQuantityPerUnit= from.getProductQuantityPerUnit();
        unitsInStock=from.getUnitsInStock();
    }
}
