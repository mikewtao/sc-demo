package com.github.mikewtao.pojo.productservice;

import lombok.Data;

@Data
public class Product {
    private double price;
    private String name;
    private String from;

    public Product(double price, String name, String from) {
        this.price = price;
        this.name = name;
        this.from = from;
    }
}
