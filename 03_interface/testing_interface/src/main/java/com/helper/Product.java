package com.helper;

import java.awt.event.WindowStateListener;

public class Product {

    private String id;
    private String name;
    private double price;
    private String description;
    private static Long inIncreaser = 0l;

    private String idGenerator(){

        inIncreaser++;
        return "PT".concat(String.format("%06d",inIncreaser));
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product(String name, double price, String description) {
        this.id = idGenerator();
        this.name = name;
        this.price = price;
        this.description = description;
    }




}

