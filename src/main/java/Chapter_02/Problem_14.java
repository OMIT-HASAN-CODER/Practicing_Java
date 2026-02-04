package Chapter_02;

import java.util.Scanner;

public class Problem_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter total call duration in minutes: ");
        int totalMinutes = input.nextInt();

        double totalBill = 0.0;
        double baseCharge = 125.0;

        if (totalMinutes <= 500) {
            totalBill = baseCharge;
        } else if (totalMinutes <= 1000) {
            totalBill = baseCharge + (totalMinutes - 500) * 0.25;
        } else {
            totalBill = baseCharge + (500 * 0.25) + (totalMinutes - 1000) * 0.49;
        }

        System.out.println("Total bill: " + totalBill);
    }
}
