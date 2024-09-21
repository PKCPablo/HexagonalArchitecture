package com.example.shop.domain.product;

import java.util.Objects;

public record ProductName(String value) {

    public ProductName {
        Objects.requireNonNull(value, "'value' must not be null");

        if(value.isEmpty()) {
            throw new IllegalArgumentException("'value' must not be empty");
        }
    }

}
