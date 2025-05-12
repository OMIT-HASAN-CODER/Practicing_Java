package com.chapter_2_problems;

import java.util.Scanner;

public class FitRectangleInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double diagonal = Math.sqrt(height * height + width * width);

        if (diagonal / 2 <= radius) {
            System.out.println("The rectangle can fit inside the circle");
        } else {
            System.out.println("The rectangle cannot fit inside the circle");
        }
    }
}

