package Chapter_04;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();
        int[] fib = new int[n];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("Fibonacci Series for upto " + n + " is: " + Arrays.toString(fib));
    }
}
