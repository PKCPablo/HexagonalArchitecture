package com.example.shop.application.ports.input;

import com.example.shop.application.service.ProductNotFoundException;
import com.example.shop.domain.product.Product;

import java.util.List;

public interface FindProductsByNameUseCase {
    List<Product> findByName(String name) throws ProductNotFoundException;
}
