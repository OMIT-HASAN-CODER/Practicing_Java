package Chapter_02;

import java.util.Scanner;

public class Problem_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter total slices: ");
        int totalSlices = input.nextInt();
        System.out.println("Enter number of your friend(s): ");
        int friends = input.nextInt();
        System.out.println("How many slice each wants: ");
        int wantEach = input.nextInt();

        int totalNeeded = friends * wantEach;

        if (totalSlices >= totalNeeded) {
            System.out.println("Yes, it's possible to split the pizza fairly.");
        } else {
            System.out.println("Sorry, it's not possible to split the pizza fairly.");
        }
    }
}
