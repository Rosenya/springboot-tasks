package com.codecool.spingboot_tasks.error_handling.model;

import lombok.Data;

@Data
public class Product {
    private final long id;
    private final String name;
    private final int price;

    public Product(long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
