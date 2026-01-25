package Chapter_02;

import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight(kg): ");
        double weight = input.nextDouble();
        System.out.println("Enter your height(m): ");
        double height = input.nextDouble();

        double BMI = weight / (height * height);

        System.out.println("Your BMI is: " + BMI);
    }
}
