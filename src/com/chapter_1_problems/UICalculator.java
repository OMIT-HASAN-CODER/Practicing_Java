package com.chapter_1_problems;

import java.util.Scanner;

public class UICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNumber = input.nextDouble();

        System.out.println("Enter second number: ");
        double secondNumber = input.nextDouble();

        double addition = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}
