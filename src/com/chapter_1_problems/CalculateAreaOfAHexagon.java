package com.chapter_1_problems;

import java.util.Scanner;

public class CalculateAreaOfAHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = input.nextDouble();

        double area = (3 * Math.sqrt(3) / 2) * (a * a);

        System.out.println("Area of a hexagon: " + area);
    }
}
