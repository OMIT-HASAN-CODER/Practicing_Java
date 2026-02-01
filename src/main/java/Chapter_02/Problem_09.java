package Chapter_02;

import java.util.Scanner;

public class Problem_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your amount: ");
        int amount = input.nextInt();

        double charge = (amount * 0.001) * 18.5;

        System.out.println("Charge = " + charge);
     }
}
