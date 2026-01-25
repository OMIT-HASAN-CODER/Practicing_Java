package Chapter_02;

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of Ax: ");
        double Ax = input.nextDouble();
        System.out.println("Enter the value of Ay: ");
        double Ay = input.nextDouble();
        System.out.println("Enter the value of Bx: ");
        double Bx = input.nextDouble();
        System.out.println("Enter the value of By: ");
        double By = input.nextDouble();
        System.out.println("Enter the value of Cx: ");
        double Cx = input.nextDouble();
        System.out.println("Enter the value of Cy: ");
        double Cy = input.nextDouble();

        double area = 0.5 * Math.abs(Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By));

        System.out.println("Area is: " + area);
    }
}
