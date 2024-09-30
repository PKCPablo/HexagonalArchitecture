package com.example.shop.infrastructure.persistence;

import com.example.shop.application.port.out.persistence.ProductRepository;
import com.example.shop.domain.product.Product;
import com.example.shop.domain.product.ProductId;

import java.util.List;
import java.util.Optional;

public class H2ProductRepository implements ProductRepository {
    @Override
    public void save(Product product) {

    }

    @Override
    public Optional<Product> findById(ProductId productId) {
        return Optional.empty();
    }

    @Override
    public List<Product> findByName(String query) {
        return List.of();
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public void delete(Product product) {

    }
}
