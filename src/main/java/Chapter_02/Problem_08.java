package Chapter_02;

import java.util.Scanner;

public class Problem_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount is BDT: ");
        int bdt = input.nextInt();
        System.out.println("Enter exchange rate (in USD): ");
        double usdRate = input.nextDouble();
        System.out.println("Enter exchange rate (in CAD): ");
        double cadRate = input.nextDouble();

        double usd = (double) bdt * usdRate;
        double cad = (double) bdt * cadRate;

        System.out.println("USD: " + usd);
        System.out.println("CAD: " + cad);
    }
}
