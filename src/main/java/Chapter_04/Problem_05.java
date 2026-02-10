package Chapter_04;

import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter numbers one by one: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
    }
}
