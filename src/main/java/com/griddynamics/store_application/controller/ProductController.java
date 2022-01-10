package com.griddynamics.store_application.controller;

import com.griddynamics.store_application.dto.ProductsDTO;
import com.griddynamics.store_application.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/all")
    public List<ProductsDTO> allProducts() {
        return productService.getAll();
    }
}
