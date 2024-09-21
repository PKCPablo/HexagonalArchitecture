package com.example.shop.application.service.product;

import com.example.shop.application.port.in.product.DeleteProductUseCase;
import com.example.shop.application.port.out.persistence.ProductRepository;
import com.example.shop.domain.product.Product;
import com.example.shop.domain.product.ProductId;

import java.util.Objects;

public class DeleteProductService implements DeleteProductUseCase {

    private final ProductRepository productRepository;

    public DeleteProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public void deleteProduct(ProductId productId) throws ProductNotFoundException {
        Objects.requireNonNull(productId);

        Product product = productRepository.findById(productId).orElseThrow(ProductNotFoundException::new);
        productRepository.delete(product);
    }
}
