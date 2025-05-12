package com.chapter_2_problems;

import java.util.Scanner;

public class DivisibleBy5And6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println(number + " is divisible by both 5 and 6.");
        }else {
            System.out.println(number + " is not divisible by both 5 and 6.");
        }
    }
}
