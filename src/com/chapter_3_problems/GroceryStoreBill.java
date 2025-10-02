package com.chapter_3_problems;

import java.util.Scanner;

public class GroceryStoreBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many products did you buy? ");
        int numberOfProducts = input.nextInt();

        int subtotal = 0;
        System.out.print("Enter their price one by one: ");
        for (int i = 1; i <= numberOfProducts; i++) {
            int price = input.nextInt();
            subtotal += price;
        }
        int totalPrice = (int) (subtotal + (subtotal * 0.15));
        System.out.println("Total price: " + totalPrice);

        int amountPaid = 0;
        while (amountPaid < totalPrice) {
            System.out.print("Please pay the money: ");
            int payment = input.nextInt();
            amountPaid += payment;
            int amountRemaining = totalPrice - amountPaid;
            if (amountRemaining > 0) {
                System.out.print("You have to pay more: " + amountRemaining);
                System.out.println();
            }
        }
        int change = amountPaid - totalPrice;
        if (change > 0) {
            System.out.println("Here is your change: " + change);
        }
    }
}
