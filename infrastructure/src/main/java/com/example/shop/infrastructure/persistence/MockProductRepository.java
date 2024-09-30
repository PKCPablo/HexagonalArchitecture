package com.example.shop.infrastructure.persistence;

import com.example.shop.application.port.out.persistence.ProductRepository;
import com.example.shop.domain.product.Product;
import com.example.shop.domain.product.ProductId;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MockProductRepository implements ProductRepository {

    private static Map<ProductId, Product> productDB;

    @Override
    public void save(Product product) {
        productDB.put(product.getId(),product);
    }

    @Override
    public Optional<Product> findById(ProductId productId) {
        return Optional.ofNullable(productDB.get(productId));
    }

    @Override
    public List<Product> findByName(String query) {
        List<Product> list = productDB.forEach();
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
