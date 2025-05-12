package com.chapter_2_problems;

import java.util.Scanner;

public class IsEqualOrNotEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = input.nextInt();
        System.out.println("Enter the value of b: ");
        int b = input.nextInt();
        System.out.println("Enter the value of c: ");
        int c = input.nextInt();
        System.out.println("Enter the value of d: ");
        int d = input.nextInt();

        if (a == b && b == c && c == d && d == a) {
            System.out.println("All numbers are equal");
        }else {
            System.out.println("All numbers are not equal");
        }
    }
}
