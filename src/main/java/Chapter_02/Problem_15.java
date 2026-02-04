package Chapter_02;

import java.util.Scanner;

public class Problem_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter monthly deposit amount: ");
        double monthlyDeposit = input.nextDouble();

        final double CAR_PRICE = 3500000;

        int months = (int) Math.ceil(CAR_PRICE / monthlyDeposit);

        System.out.println("You can buy the car in " + months + " months.");
    }
}
