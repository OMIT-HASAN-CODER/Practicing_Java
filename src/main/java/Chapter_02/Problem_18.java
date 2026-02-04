package Chapter_02;

import java.util.Scanner;

public class Problem_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter height: ");
        double height = input.nextDouble();
        System.out.println("Enter width: ");
        double width = input.nextDouble();
        System.out.println("Enter radius: ");
        double radius = input.nextDouble();

        double diagonal = Math.sqrt((height * height) + (width * width));
        double diameter = 2 * radius;

        if (diagonal <= diameter) {
            System.out.println("The rectangle can fit inside the circle.");
        } else {
            System.out.println("The rectangle cannot fit inside the circle.");
        }
    }
}
