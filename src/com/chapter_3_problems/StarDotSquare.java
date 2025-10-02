package com.chapter_3_problems;

import java.util.Enumeration;
import java.util.Scanner;

public class StarDotSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(". ");
            }
            for (int j = 1; j <= (n + 1) - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
