package com.example.shop.application.service.product;

import com.example.shop.application.port.in.product.UpdateProductUseCase;
import com.example.shop.application.port.out.persistence.ProductRepository;
import com.example.shop.domain.product.Product;

import java.util.Objects;

public class UpdateProductService implements UpdateProductUseCase {
    private final ProductRepository productRepository;

    public UpdateProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void updateProduct(Product product) {
        Objects.requireNonNull(product);

        productRepository.update(product);

    }
}
