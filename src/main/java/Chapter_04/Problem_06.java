package Chapter_04;

import java.util.Arrays;

public class Problem_06 {
    public static int[] removeOddNumbers(int[] arr) {
        int evenCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        int[] result = new int[evenCount];
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] evensOnly = removeOddNumbers(original);
        System.out.println(Arrays.toString(evensOnly));
    }
}
