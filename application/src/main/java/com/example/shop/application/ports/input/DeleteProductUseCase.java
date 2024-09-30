package com.example.shop.application.ports.input;

import com.example.shop.application.service.ProductNotFoundException;
import com.example.shop.domain.product.ProductId;

public interface DeleteProductUseCase {
    void deleteProduct(ProductId productId) throws ProductNotFoundException;
}
