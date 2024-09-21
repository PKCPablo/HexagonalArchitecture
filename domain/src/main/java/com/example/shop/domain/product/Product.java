package com.example.shop.domain.product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private final ProductId id;
    private final ProductName name;
    private String description;
}
