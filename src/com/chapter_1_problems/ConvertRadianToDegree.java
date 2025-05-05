package com.chapter_1_problems;

import java.util.Scanner;

public class ConvertRadianToDegree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of radian: ");
        double radian = input.nextDouble();

        double degree = radian * (180 / 3.1416);

        System.out.println("Degree: " + degree);
    }
}
