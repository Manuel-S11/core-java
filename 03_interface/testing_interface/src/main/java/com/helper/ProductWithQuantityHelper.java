package com.helper;

public class ProductWithQuantityHelper {

    private Product product;
    private int quantity;

    public ProductWithQuantityHelper(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice(){
        return product.getPrice() * quantity;
    }

}

