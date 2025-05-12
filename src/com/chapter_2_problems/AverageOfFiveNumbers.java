package com.chapter_2_problems;

import java.util.Scanner;

public class AverageOfFiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = input.nextInt();
        System.out.println("Enter the value of b: ");
        int b = input.nextInt();
        System.out.println("Enter the value of c: ");
        int c = input.nextInt();
        System.out.println("Enter the value of d: ");
        int d = input.nextInt();
        System.out.println("Enter the value of e: ");
        int e = input.nextInt();

        int sum = a + b + c + d + e;
        double average = sum / 5.0;

        System.out.println("The average of the five numbers is: " + average);
    }
}
