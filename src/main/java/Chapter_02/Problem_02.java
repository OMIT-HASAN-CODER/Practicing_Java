package Chapter_02;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a = input.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = input.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = input.nextInt();
        System.out.println("Enter 4th number: ");
        int d = input.nextInt();
        System.out.println("Enter 5th number: ");
        int e = input.nextInt();

        double average = (a + b + c + d + e) / 5.0;

        System.out.println("Average is: " + average);
    }
}
