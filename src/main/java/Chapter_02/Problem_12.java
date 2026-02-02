package Chapter_02;

import java.util.Scanner;

public class Problem_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int lastDigit = number % 10;

        System.out.println("Last digit: " + lastDigit);
    }
}
