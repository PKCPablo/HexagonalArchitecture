package com.example.shop.application.port.out.persistence;

import com.example.shop.domain.product.Product;
import com.example.shop.domain.product.ProductId;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    void save(Product product);

    Optional<Product> findById(ProductId productId);

    List<Product> findByName(String query);

    List<Product> findAll();

    void delete(Product product);
}
