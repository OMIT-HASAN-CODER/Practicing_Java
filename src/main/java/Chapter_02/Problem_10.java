package Chapter_02;

import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] marks = new double[6];
        double totalMarks = 0;

        System.out.println("Enter marks for 6 subjects: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": ");
            marks[i] = input.nextDouble();
            totalMarks += marks[i];
        }

        double averageMarks = totalMarks / 6;
        double percentage = (totalMarks / 600) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Marks: %.2f", averageMarks);
        System.out.println();
        System.out.printf("Percentage: %.2f", percentage);
    }
}
