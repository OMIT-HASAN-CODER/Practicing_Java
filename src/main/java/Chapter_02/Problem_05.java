package Chapter_02;

import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter distance in meters: ");
        double distance = input.nextDouble();
        System.out.println("Enter time taken in minutes: ");
        double minutes = input.nextDouble();

        double speed = ((distance / 1000) / (minutes / 60));

        System.out.println("Speed in km/h is: " + speed);
    }
}
