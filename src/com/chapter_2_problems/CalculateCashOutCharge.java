package com.chapter_2_problems;

import java.util.Scanner;

public class CalculateCashOutCharge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your amount: ");
        double amount = input.nextDouble();

        System.out.println("Enter the cash out charge percentage: ");
        double cashOutChargePercentage = input.nextDouble();

        double cashOutCharge = (amount * cashOutChargePercentage) / 100;

        System.out.println("Charge: " + "৳" + cashOutCharge);
    }
}
