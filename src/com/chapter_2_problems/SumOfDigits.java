package com.chapter_2_problems;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 10000: ");
        int number = input.nextInt();

        if (number < 0 || number > 10000) {
            System.out.println("Number is out of range.");
            return;
        }

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
