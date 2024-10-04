package com.example.shop.infrastructure.rest.mapper;

import com.example.shop.domain.product.Product;
import com.example.shop.infrastructure.rest.dto.request.CreateProductRequest;
import com.example.shop.infrastructure.rest.dto.response.CreateProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ProductRestMapper {
    
    @Mapping(source = "name", target = "name.value")
    @Mapping(source = "description", target = "description.value")
    Product toProduct(CreateProductRequest createProductRequest);

    @Mapping(source = "id.value", target = "id")
    @Mapping(source = "name.value", target = "name")
    @Mapping(source = "description.value", target = "description")
    CreateProductResponse toCreateProductResponse(Product product);
}
