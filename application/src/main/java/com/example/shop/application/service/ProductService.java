package com.example.shop.application.service;

import com.example.shop.application.ports.input.CreateProductUseCase;
import com.example.shop.application.ports.input.DeleteProductUseCase;
import com.example.shop.application.ports.input.FindProductsByNameUseCase;
import com.example.shop.application.ports.input.UpdateProductUseCase;
import com.example.shop.application.ports.output.ProductOutputPort;
import com.example.shop.domain.product.Product;
import com.example.shop.domain.product.ProductId;

import java.util.List;
import java.util.Objects;

public class ProductService implements CreateProductUseCase, DeleteProductUseCase, FindProductsByNameUseCase, UpdateProductUseCase {

    private final ProductOutputPort productOutputPort;

    public ProductService(ProductOutputPort productOutputPort) {
        this.productOutputPort = productOutputPort;
    }

    @Override
    public Product createProduct(Product product) {
        Objects.requireNonNull(product);
        
        return productOutputPort.save(product);
    }

    @Override
    public void deleteProduct(ProductId productId) throws ProductNotFoundException {
        Objects.requireNonNull(productId);

        Product product = productOutputPort.findById(productId).orElseThrow(ProductNotFoundException::new);
        productOutputPort.delete(product);
    }

    @Override
    public List<Product> findByName(String name) throws ProductNotFoundException {
        Objects.requireNonNull(name);

        return productOutputPort.findByName(name).orElseThrow(ProductNotFoundException::new);
    }

    @Override
    public void updateProduct(Product product) {
        Objects.requireNonNull(product);

        productOutputPort.save(product);
    }
}
