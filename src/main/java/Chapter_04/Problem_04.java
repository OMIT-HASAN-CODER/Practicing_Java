package Chapter_04;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("How many numbers do you enter? ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the numbers one by one: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
