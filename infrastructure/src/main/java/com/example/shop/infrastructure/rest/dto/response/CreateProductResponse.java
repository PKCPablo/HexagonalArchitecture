package com.example.shop.infrastructure.rest.dto.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductResponse {

    private Long id;

    private String name;

    private String description;
}
