package Chapter_03;

import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(". ");
            }
            for (int j = 0; j < number + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
