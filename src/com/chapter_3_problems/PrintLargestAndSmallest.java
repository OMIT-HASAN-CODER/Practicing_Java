package com.chapter_3_problems;

import java.util.Scanner;

public class PrintLargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total count of numbers: ");
        int count = input.nextInt();

        int largest = 0, smallest = 0;
        if (count > 0) {
            System.out.print("Enter number 1: ");
            int number = input.nextInt();
            largest = number;
            smallest = number;

            for (int i = 2; i <= count; i++) {
                System.out.print("Enter number " + i + ": ");
                number = input.nextInt();

                if (number > largest) {
                    largest = number;
                } else if (number < smallest) {
                    smallest = number;
                }
            }
        } else {
            System.out.println("Invalid count.");
        }
        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);
    }
}
