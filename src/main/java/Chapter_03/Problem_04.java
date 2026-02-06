package Chapter_03;

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int count = input.nextInt();

        if (count <= 0) {
            System.out.println("You must enter at least one number.");
        } else {
            System.out.print("Enter number 1: ");
            int num = input.nextInt();

            int max = num;
            int min = num;

            for (int i = 2; i <= count; i++) {
                System.out.print("Enter number " + i + ": ");
                int currentNum = input.nextInt();

                if (currentNum > max) {
                    max = currentNum;
                }

                if (currentNum < min) {
                    min = currentNum;
                }
            }

            System.out.println("-----------------------------");
            System.out.println("The Largest number is: " + max);
            System.out.println("The Smallest number is: " + min);
        }
    }
}
