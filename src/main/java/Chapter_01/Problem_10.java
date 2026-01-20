package Chapter_01;

import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radian: ");
        double radian = input.nextDouble();

        double degree = radian * (180 / Math.PI);

        System.out.println("Degree: " + degree);
    }
}
