package com.company;

import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(String name) {
        products.add(new Milk(name));
    }


    public Product getProduct(String name) {
        for (Product product : products) {
            if (name.equals(product.name)) {
                return product;
            }
        }

        return null;
    }
}


