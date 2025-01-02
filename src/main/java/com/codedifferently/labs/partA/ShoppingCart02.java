package com.codedifferently.labs.partA;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        int num = (int) (Math.random()+1)*6;
        String message = custName+" wants to purchase " + num + itemDesc;

        // Declare and initialize numeric fields: price, tax, quantity.
    double price = Math.random() * 50;
    double tax = Math.random();



        // Declare and assign a calculated totalPrice
double totalPrice = (price*num) + tax;

        // Modify message to include quantity

        System.out.println(message);
        System.out.println("Total cost with tax is: $"+totalPrice);

        // Print another message with the total cost

    }
}
