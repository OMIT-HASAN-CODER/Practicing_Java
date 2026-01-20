package Chapter_01;

import java.util.Scanner;

public class Problem_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter wins: ");
        int win = input.nextInt();
        System.out.println("Enter draws: ");
        int draw = input.nextInt();
        System.out.println("Enter losses: ");
        int loss = input.nextInt();

        int totalPoint = ((win * 3) + (draw * 1) + (loss * 0));

        System.out.println("Total Points: " + totalPoint);
    }
}
