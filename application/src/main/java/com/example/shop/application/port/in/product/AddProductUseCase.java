package com.example.shop.application.port.in.product;

import com.example.shop.domain.product.Product;
import com.example.shop.domain.product.ProductId;
import com.example.shop.domain.product.ProductName;

public interface AddProductUseCase {
    void createProduct(ProductId productId, ProductName productName, String description);
}
