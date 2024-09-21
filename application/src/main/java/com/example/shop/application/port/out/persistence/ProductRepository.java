package com.example.shop.application.port.out.persistence;

import com.example.shop.domain.product.Product;
import com.example.shop.domain.product.ProductId;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    void create(Product product);

    Optional<Product> findById(ProductId productId);

    List<Product> findByName(String query);

    void update(Product product);

    void delete(Product product);
}
