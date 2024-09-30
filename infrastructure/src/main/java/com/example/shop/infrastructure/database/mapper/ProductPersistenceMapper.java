package com.example.shop.infrastructure.database.mapper;

import com.example.shop.domain.product.Product;
import com.example.shop.infrastructure.database.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ProductPersistenceMapper {

    ProductEntity toProductEntity(Product product);

    Product toProduct(ProductEntity productEntity);
}
