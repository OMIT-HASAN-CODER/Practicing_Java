package com.chapter_2_problems;

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter total call duration in minutes: ");
        int totalMinutes = input.nextInt();

        double bill = 125.0;

        if (totalMinutes > 500) {
            if (totalMinutes <= 1000) {
                bill += (totalMinutes - 500) * 0.25;
            }else {
                bill += (500 * 0.25);
                bill += (totalMinutes - 1000) * 0.49;
            }
        }
        System.out.println("Your total bill is: " + bill);
    }
}
