package com.example.shop.domain.product;

import lombok.NonNull;
import lombok.Value;

@Value
public class ProductName {

    @NonNull
    String value;

    public ProductName(String value) {
        if (value.length() < 2) {
            throw new IllegalArgumentException("'name' must be at least two characters long");
        }

        this.value = value;
    }
}
