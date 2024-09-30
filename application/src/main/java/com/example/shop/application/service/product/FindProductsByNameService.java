package com.example.shop.application.service.product;

import com.example.shop.application.port.in.product.FindProductsByNameUseCase;
import com.example.shop.application.port.out.persistence.ProductRepository;
import com.example.shop.domain.product.Product;

import java.util.List;
import java.util.Objects;

public class FindProductsByNameService implements FindProductsByNameUseCase {
    private final ProductRepository productRepository;

    public FindProductsByNameService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findByName(String query) {

        Objects.requireNonNull(query, "'query' must not be null");

        if (query.length() < 2) {
            throw new IllegalArgumentException("'query' must be at least two characters long");
        }

        return productRepository.findByName(query);
    }
}
