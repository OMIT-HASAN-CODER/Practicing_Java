package com.chapter_2_problems;

import java.util.Scanner;

public class calculateResults {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of first subject: ");
        double firstSubject = input.nextDouble();
        System.out.println("Enter the number of second subject: ");
        double secondSubject = input.nextDouble();
        System.out.println("Enter the number of third subject: ");
        double thirdSubject = input.nextDouble();
        System.out.println("Enter the number of fourth subject: ");
        double fourthSubject = input.nextDouble();
        System.out.println("Enter the number of fifth subject: ");
        double fifthSubject = input.nextDouble();
        System.out.println("Enter the number of sixth subject: ");
        double sixthSubject = input.nextDouble();

        double totalMarks = firstSubject + secondSubject + thirdSubject + fourthSubject + fifthSubject + sixthSubject;
        double averageMarks = totalMarks / 6;
        double percentage = (totalMarks / 600) * 100;

        System.out.printf("Total marks: %.2f%n", totalMarks);
        System.out.printf("Average marks: %.2f%n", averageMarks);
        System.out.printf("Percentage: %.2f%%%n", percentage);
    }
}
