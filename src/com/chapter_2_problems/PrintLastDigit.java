package com.chapter_2_problems;

import java.util.Scanner;

public class PrintLastDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Number is negative. Please enter a positive number.");
            return;
        }

        int lastDigit = number % 10;

        System.out.println("Last Digit: " + lastDigit);
    }
}
