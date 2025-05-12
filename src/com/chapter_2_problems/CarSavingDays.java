package com.chapter_2_problems;

import java.util.Scanner;

public class CarSavingDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double carPrice = 3500000;
        System.out.println("Enter monthly saving amount: ");
        double monthlySaving = input.nextDouble();

        int months = (int) Math.ceil(carPrice / monthlySaving);
        System.out.println("You will be able to buy the car after " + months + " months.");
    }
}

