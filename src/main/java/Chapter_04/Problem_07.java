package Chapter_04;

import java.util.Scanner;

public class Problem_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter numbers one by one: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter target result: ");
        int n = input.nextInt();

        findPair(arr, n);
    }

    public static void findPair(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    System.out.println("Found pair: " + arr[i] + ", " + arr[j]);
                    return;
                }
            }
        }

        System.out.println("No pair found.");
    }
}
