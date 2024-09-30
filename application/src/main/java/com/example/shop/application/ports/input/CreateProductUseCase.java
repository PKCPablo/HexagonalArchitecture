package com.example.shop.application.ports.input;

import com.example.shop.domain.product.Product;

public interface CreateProductUseCase {
    Product createProduct(Product product);
}
