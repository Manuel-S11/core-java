package com.helper;

public class Main {

    static void main() {

        Product product1 = new Product("Product 1", 10.0, "Description 1");

        ProductWithQuantityHelper item1 = new ProductWithQuantityHelper(product1, 2);
        System.out.println(item1.getTotalPrice());
        IO.println(product1.getId());

        System.out.println("\n=============================================================\n");
        Product product2 = new Product("Product 1", 10.0, "Description 1");
        ProductWithQuantityHelper item2 = new ProductWithQuantityHelper(product2, 2);
        System.out.println(item2.getTotalPrice());
        IO.println(product2.getId());


        System.out.println("\n=============================================================\n");
        Product product3 = new Product("Product 1", 10.0, "Description 1");
        ProductWithQuantityHelper item3 = new ProductWithQuantityHelper(product3, 2);
        System.out.println(item3.getTotalPrice());
        IO.println(product3.getId());
    }
}
