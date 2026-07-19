package com.engine.entity;

import com.engine.entity.actionHolder.BeverageMaker;

import java.math.BigDecimal;

public abstract class BeverageInfo extends BeverageMaker {

    private String name;
    private String Category;
    private String brand;
    private double price;
    private boolean isAvailable;
    private String orderCount;
    private String temperature;
    private BeverageType beverageType;


    protected BeverageInfo(
            String name,
            String category,
            String brand,
            double price,
            boolean isAvailable,
            String orderCount,
            String temperature,
            BeverageType beverageType) {
        this.name = name;
        Category = category;
        this.brand = brand;
        this.price = price;
        this.isAvailable = isAvailable;
        this.orderCount = orderCount;
        this.temperature = temperature;
    }





}
