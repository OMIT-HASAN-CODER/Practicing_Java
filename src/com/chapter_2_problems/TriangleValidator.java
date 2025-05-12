package com.chapter_2_problems;

import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the first edge: ");
        double a = input.nextDouble();
        System.out.println("Enter the length of the second edge: ");
        double b = input.nextDouble();
        System.out.println("Enter the length of the third edge: ");
        double c = input.nextDouble();

        if (a + b > c && a + c > b && b + c > a ) {
            System.out.println("Inputs are valid");
        } else {
            System.out.println("Inputs are invalid.");
        }
    }
}
