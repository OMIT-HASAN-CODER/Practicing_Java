package Chapter_02;

import java.util.Scanner;

public class Problem_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter seconds: ");
        long totalSeconds = input.nextLong();

        long hours = totalSeconds / 3600;
        long remainingSeconds = totalSeconds % 3600;
        long minutes = remainingSeconds / 60;
        long seconds = remainingSeconds % 60;

        System.out.println(hours + " hour(s) " + minutes + " minute(s) " + seconds + " second(s)");
    }
}
