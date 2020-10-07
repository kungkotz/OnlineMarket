package com.company;

public class Milk extends Product {

    Milk(String name) {
        super(name);
    }
    int buyAmount = 10;
    int totalPrice = 30;

    public int buyMilk() {
        if (totalPrice > 0) {
            totalPrice -= buyAmount;
            return buyAmount;
        }
        else System.out.println("No milk left");
        return 0;
    }
}
