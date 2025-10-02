package com.chapter_3_problems;

import java.util.Scanner;

public class PalindromeFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = input.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = input.nextInt();

        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        if (number < 0) {
            return false;
        }
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
        }
        return originalNumber == reversedNumber;
    }
}
