package com.codecool.spingboot_tasks.error_handling.service;

import com.codecool.spingboot_tasks.error_handling.exception.ProductNotFoundException;
import com.codecool.spingboot_tasks.error_handling.model.Product;
import com.codecool.spingboot_tasks.error_handling.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProduct(long id) {
        return productRepository.findById(id);
    }

    public void createNewProduct(Product product){
        productRepository.create(product);
        log.info("New product with id:" + product.getId() + "have been created");
    }
//
//    try{
//        if (productRepository == null) {
//            System.out.println("There is no product.");}
//        } catch(ProductNotFoundException ex){
//            ex.printStackTrace();
//
//        } finally {
//            System.out.println("Code is correct.");
//        }

}
