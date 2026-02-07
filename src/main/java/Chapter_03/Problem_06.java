package Chapter_03;

import java.util.Scanner;

public class Problem_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int start = input.nextInt();
        System.out.println("Enter second number: ");
        int end = input.nextInt();

        System.out.println("Palindrome numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            int reversedNumber = 0;
            int temp = i;

            while (temp != 0) {
                int digit = temp % 10;
                reversedNumber = reversedNumber * 10 + digit;
                temp /= 10;
            }
            if (i == reversedNumber) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
