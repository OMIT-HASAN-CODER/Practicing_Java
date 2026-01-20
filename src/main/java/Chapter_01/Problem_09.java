package Chapter_01;

import java.util.Scanner;

public class Problem_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length: ");
        double length = input.nextDouble();
        System.out.println("Enter width: ");
        double width = input.nextDouble();
        System.out.println("Enter height: ");
        double height = input.nextDouble();

        double volume = length * width * height;

        System.out.println("Volume: " + volume);
    }
}
