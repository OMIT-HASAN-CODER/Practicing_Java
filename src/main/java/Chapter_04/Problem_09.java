package Chapter_04;

import java.util.Random;

public class Problem_09 {
    public static void main(String[] args) {
        int[][] temps = new int[64][365];

        Random rand = new Random();
        long sum = 0;
        int maxTemp = Integer.MIN_VALUE;
        int minTemp = Integer.MAX_VALUE;

        for (int district = 0; district < 64; district++) {
            for (int day = 0; day < 365; day++) {
                temps[district][day] = rand.nextInt(31) + 10;

                int currentTemp = temps[district][day];
                sum += currentTemp;

                if (currentTemp > maxTemp) {
                    maxTemp = currentTemp;
                }
                if (currentTemp < minTemp) {
                    minTemp = currentTemp;
                }
            }
        }

        double average = (double) sum / (64 * 365);

        System.out.println("--- Yearly Weather Report ---");
        System.out.printf("Average Temperature: %.2f degrees\n", average);
        System.out.println("Maximum Temperature: " + maxTemp + " degrees");
        System.out.println("Minimum Temperature: " + minTemp + " degrees");
    }
}
