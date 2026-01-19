package Chapter_01;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double a = input.nextDouble();
        System.out.println("Enter another number: ");
        double b = input.nextDouble();

        double add = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;

        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
    }
}
