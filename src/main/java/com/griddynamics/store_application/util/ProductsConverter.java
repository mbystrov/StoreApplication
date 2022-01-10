package com.griddynamics.store_application.util;

import com.griddynamics.store_application.dto.ProductsDTO;
import com.griddynamics.store_application.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductsConverter {

    public ProductsDTO convertToDto(Product product) {
        return ProductsDTO.builder()
                .id(product.getId())
                .title(product.getTitle())
                .available(product.getAmount())
                .price(product.getPrice())
                .build();
    }
}
