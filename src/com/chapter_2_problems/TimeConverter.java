package com.chapter_2_problems;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time in seconds: ");
        int totalSeconds = input.nextInt();

        if (totalSeconds < 0) {
            System.out.println("Time cannot be negative.");
            return;
        }

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(hours + " hour(s) " + minutes + " minute(s) " + seconds + " second(s)");
    }
}
