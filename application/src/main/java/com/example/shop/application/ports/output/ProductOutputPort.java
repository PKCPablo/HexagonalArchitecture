package com.example.shop.application.ports.output;

import com.example.shop.domain.product.Product;
import com.example.shop.domain.product.ProductId;

import java.util.List;
import java.util.Optional;

public interface ProductOutputPort {

    Product save(Product product);

    Optional<Product> findById(ProductId productId);

    Optional<List<Product>> findByName(String name);

    List<Product> findAll();

    void delete(Product product);
}
