package com.example.shop.infrastructure.database;

import com.example.shop.application.ports.output.ProductOutputPort;
import com.example.shop.domain.product.Product;
import com.example.shop.domain.product.ProductId;
import com.example.shop.infrastructure.database.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class ProductPersistenceAdapter implements ProductOutputPort {

    private final ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(ProductId productId) {
        return productRepository.findById(productId);
    }

    @Override
    public Optional<List<Product>> findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }
}
