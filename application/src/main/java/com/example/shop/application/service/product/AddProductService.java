package com.example.shop.application.service.product;

import com.example.shop.application.port.in.product.AddProductUseCase;
import com.example.shop.application.port.out.persistence.ProductRepository;
import com.example.shop.domain.product.Product;
import com.example.shop.domain.product.ProductId;
import com.example.shop.domain.product.ProductName;

import java.util.Objects;

public class AddProductService implements AddProductUseCase {

    private final ProductRepository productRepository;

    public AddProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void createProduct(ProductId productId, ProductName productName, String description) {
        Objects.requireNonNull(productId);
        Objects.requireNonNull(productName);
        Objects.requireNonNull(description);

        if (description.isEmpty()) {
            throw new IllegalArgumentException("'description' must not be empty");
        }

        Product product = new Product(productId, productName, description);

        productRepository.save(product);
    }
}
