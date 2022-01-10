package com.griddynamics.store_application.service;

import com.griddynamics.store_application.dto.ProductsDTO;
import com.griddynamics.store_application.entity.Product;
import com.griddynamics.store_application.repository.ProductRepository;
import com.griddynamics.store_application.util.ProductsConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    public final ProductsConverter productsConverter;

    public List<ProductsDTO> getAll() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(productsConverter::convertToDto)
                .collect(Collectors.toList());
    }
}
