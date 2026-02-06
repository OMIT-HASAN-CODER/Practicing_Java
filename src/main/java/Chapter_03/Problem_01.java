package Chapter_03;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i + 64));
            }
            System.out.println();
        }
    }
}
