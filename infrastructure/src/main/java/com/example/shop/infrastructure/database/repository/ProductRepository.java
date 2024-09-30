package com.example.shop.infrastructure.database.repository;

import com.example.shop.domain.product.Product;
import com.example.shop.domain.product.ProductId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, ProductId> {

    Optional<List<Product>> findByName(String name);
}
