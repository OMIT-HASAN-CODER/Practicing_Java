package Chapter_02;

import java.util.Scanner;

public class Problem_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first edge: ");
        double firstEdge = input.nextDouble();
        System.out.println("Enter second edge: ");
        double secondEdge = input.nextDouble();
        System.out.println("Enter third edge: ");
        double thirdEdge = input.nextDouble();

        if ((firstEdge < secondEdge + thirdEdge) && (secondEdge < firstEdge + thirdEdge) && (thirdEdge < firstEdge + secondEdge)) {
            System.out.println("Inputs are valid.");
        } else {
            System.out.println("Inputs are invalid.");
        }
    }
}
