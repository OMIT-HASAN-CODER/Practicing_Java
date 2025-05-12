package com.chapter_2_problems;

import java.util.Scanner;

public class CalculateAreaOfCoordinatesOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point (Ax, Ay): ");
        double Ax = input.nextDouble();
        double Ay = input.nextDouble();
        System.out.println("Enter the coordinates of the second point (Bx, By): ");
        double Bx = input.nextDouble();
        double By = input.nextDouble();
        System.out.println("Enter the coordinates of the third point (Cx, Cy): ");
        double Cx = input.nextDouble();
        double Cy = input.nextDouble();

        double area = 0.5 * Math.abs(Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By));

        System.out.printf("The area of the triangle formed by the points (%.2f, %.2f), (%.2f, %.2f), and (%.2f, %.2f) is: %.2f%n", Ax, Ay, Bx, By, Cx, Cy, area);
    }
}
