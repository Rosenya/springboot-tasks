package com.codecool.spingboot_tasks.error_handling.repository;

import com.codecool.spingboot_tasks.error_handling.exception.ProductNotFoundException;
import com.codecool.spingboot_tasks.error_handling.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    public List<Product> findAll(){
        throw new IllegalStateException();
    }

    public List<Product> findById(long id) {
        throw new ProductNotFoundException("There is no product with id: " + id);
    }

    public List<Product> create(){

    }
}
