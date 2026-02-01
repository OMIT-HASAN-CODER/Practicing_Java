package Chapter_02;

import java.util.Scanner;

public class Problem_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        System.out.println("The sum of all digits of " + originalNumber + " is: " +sum);
    }
}
