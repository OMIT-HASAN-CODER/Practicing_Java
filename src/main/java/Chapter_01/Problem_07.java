package Chapter_01;

import java.util.Scanner;

public class Problem_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of x1: ");
        double x1 = input.nextDouble();
        System.out.println("Enter the value of x2: ");
        double x2 = input.nextDouble();
        System.out.println("Enter the value of y1: ");
        double y1 = input.nextDouble();
        System.out.println("Enter the value of y2: ");
        double y2 = input.nextDouble();

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("Distance: " + distance);
    }
}
