package com.griddynamics.store_application.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductsDTO {

    private Integer id;
    private String title;
    private Integer available;
    private String price;
}
