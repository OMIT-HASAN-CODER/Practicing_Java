package com.chapter_1_problems;

import java.util.Scanner;

public class CalculateTotalPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of wins: ");
        int wins = input.nextInt();

        System.out.println("Enter the value of draws: ");
        int draws = input.nextInt();

        System.out.println("Enter the value of losses: ");
        int losses = input.nextInt();

        int totalPoints = (wins * 3) + (draws * 1) + (losses * 0);

        System.out.println("Total points: " + totalPoints);
    }
}
