package com.chapter_2_problems;

import java.util.Scanner;

public class CalculateSpeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the distance in meters: ");
        double distanceInMeters = input.nextDouble();
        System.out.println("Enter the time in minutes: ");
        double timeInMinutes = input.nextDouble();

        double distanceInKilometers = distanceInMeters / 1000;
        double timeInHours = timeInMinutes / 60;
        double speed = distanceInKilometers / timeInHours;

        System.out.printf("The speed is: %.2f km/h%n", speed);
    }
}
