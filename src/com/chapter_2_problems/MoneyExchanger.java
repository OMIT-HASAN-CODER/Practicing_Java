package com.chapter_2_problems;

import java.util.Scanner;

public class MoneyExchanger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount is BDT: ");
        double amount = input.nextDouble();
        System.out.println("Enter the current exchange rate (in USD): ");
        double exchangeRate = input.nextDouble();
        System.out.println("Enter the current exchange rate (in CAD): ");
        double exchangeRateCAD = input.nextDouble();

        double amountInUSD = amount * exchangeRate;
        double amountInCAD = amount * exchangeRateCAD;

       System.out.println("Amount in USD: " + amountInUSD );
       System.out.println("Amount in CAD: " + amountInCAD );
    }
}
