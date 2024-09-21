package com.example.shop.application.port.in.product;

import com.example.shop.domain.product.Product;

import java.util.List;

public interface FindProductsUseCase {
    List<Product> findByName(String query);
}
