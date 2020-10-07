package com.company;

public class Customer extends Person {

    ShoppingCart shoppingCart = new ShoppingCart();
    int expenses = 0;

    Customer(String name) {
        super(name);
    }

    public void goShopping(String name) {
        Milk shoppaloss = (Milk)shoppingCart.getProduct(name);
        expenses+=shoppaloss.buyMilk();
    }

}
