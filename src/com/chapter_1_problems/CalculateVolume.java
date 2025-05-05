package com.chapter_1_problems;

import java.util.Scanner;

public class CalculateVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.println("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.println("Enter the value of c: ");
        double c = input.nextDouble();

        double volume = a * b * c;

        System.out.println("Volume: " + volume);
    }
}
