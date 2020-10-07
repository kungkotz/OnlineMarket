package com.company;

public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Arne");
        customer1.shoppingCart.addProduct("milk1");

        customer1.goShopping("milk1");
        customer1.goShopping("milk1");
        customer1.goShopping("milk1");
        customer1.goShopping("milk1");
        System.out.println(customer1.expenses);
    }
}

