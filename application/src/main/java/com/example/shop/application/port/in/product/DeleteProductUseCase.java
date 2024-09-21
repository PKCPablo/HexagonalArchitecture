package com.example.shop.application.port.in.product;

import com.example.shop.application.service.product.ProductNotFoundException;
import com.example.shop.domain.product.Product;
import com.example.shop.domain.product.ProductId;

public interface DeleteProductUseCase {
    void deleteProduct(ProductId productId) throws ProductNotFoundException;
}
