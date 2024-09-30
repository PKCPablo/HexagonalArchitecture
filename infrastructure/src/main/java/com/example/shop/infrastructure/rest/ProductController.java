package com.example.shop.infrastructure.rest;

import com.example.shop.infrastructure.rest.dto.request.CreateProductRequest;
import com.example.shop.infrastructure.rest.dto.response.CreateProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public interface ProductController {

    @RequestMapping(path = "/product", method = RequestMethod.POST)
    public ResponseEntity<CreateProductResponse> createProduct(@RequestBody CreateProductRequest request);
}
