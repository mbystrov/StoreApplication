package com.griddynamics.store_application.repository;

import com.griddynamics.store_application.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findAll();
}
