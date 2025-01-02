package com.codedifferently.labs.partA;

public class ShoppingCart01 {
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.

String custName = "Kianna wants to buy";
String itemDesc = "pizza from Grotto's Pizza";
String literal = "a";
        System.out.println(" " + custName + " wants to buy " + literal + itemDesc + " from Grotto's Pizzeria.");



        // Assign the message variable
        String print = custName.concat(" a ");
        print = print.concat(itemDesc);
        System.out.println(print);

        // Print and run the code

    }
}
