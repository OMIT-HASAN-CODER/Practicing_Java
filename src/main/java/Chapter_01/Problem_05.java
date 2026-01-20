package Chapter_01;

import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = input.nextDouble();

        double area = a * b;
        double range = 2 * (a + b);

        System.out.println("Area is: " + area);
        System.out.println("Range is: " + range);
    }
}
