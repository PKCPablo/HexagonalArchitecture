package com.example.shop.infrastructure.rest.impl;

import com.example.shop.application.ports.input.CreateProductUseCase;
import com.example.shop.domain.product.Product;
import com.example.shop.infrastructure.rest.ProductController;
import com.example.shop.infrastructure.rest.dto.request.CreateProductRequest;
import com.example.shop.infrastructure.rest.dto.response.CreateProductResponse;
import com.example.shop.infrastructure.rest.mapper.ProductRestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductControllerImpl implements ProductController {

    private final CreateProductUseCase createProductUseCase;

    private final ProductRestMapper productRestMapper;

    @Override
    public ResponseEntity<CreateProductResponse> createProduct(CreateProductRequest request) {
        // Map from External DTO to Domain Entity
        Product product = productRestMapper.toProduct(request);

        // Request to Application
        product = createProductUseCase.createProduct(product);

        // Return response
        return new ResponseEntity<>(productRestMapper.toCreateProductResponse(product), HttpStatus.CREATED);
    }
}
