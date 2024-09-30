package com.example.shop.domain.product;

import lombok.Data;

@Data
public class Product {
    private ProductId id;
    private ProductName name;
    private ProductDescription description;
}
