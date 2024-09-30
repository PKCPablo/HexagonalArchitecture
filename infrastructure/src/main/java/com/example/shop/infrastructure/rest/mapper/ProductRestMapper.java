package com.example.shop.infrastructure.rest.mapper;

import com.example.shop.domain.product.Product;
import com.example.shop.infrastructure.rest.dto.request.CreateProductRequest;
import com.example.shop.infrastructure.rest.dto.response.CreateProductResponse;
import org.mapstruct.Mapper;

@Mapper
public interface ProductRestMapper {

    Product toProduct(CreateProductRequest createProductRequest);

    CreateProductResponse toCreateProductResponse(Product product);
}
