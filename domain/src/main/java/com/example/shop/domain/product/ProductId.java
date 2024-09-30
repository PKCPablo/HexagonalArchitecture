package com.example.shop.domain.product;

import lombok.NonNull;
import lombok.Value;

@Value
public class ProductId {
    
    @NonNull
    Long value;
}
