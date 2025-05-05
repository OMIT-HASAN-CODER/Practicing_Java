package com.chapter_1_problems;

import java.util.Scanner;

public class CalculateAreaAndRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.println("Enter the value of b: ");
        double b = input.nextDouble();

        double area = a * b;
        double range = 2 * (a + b);

        System.out.println("Area: " + area);
        System.out.println("Range: " + range);

    }
}
