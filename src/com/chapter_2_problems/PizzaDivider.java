package com.chapter_2_problems;

import java.util.Scanner;

public class PizzaDivider {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total slices: ");
        int slices = input.nextInt();

        System.out.print("Enter number of your friend(s): ");
        int friends = input.nextInt();

        System.out.print("How many slices each wants: ");
        int slicesPerFriend = input.nextInt();

        if (friends * slicesPerFriend <= slices) {
            System.out.println("Yes, it's possible to split the pizza fairly.");
        } else {
            System.out.println("Sorry, it's not possible to split the pizza fairly.");
        }
    }
}

