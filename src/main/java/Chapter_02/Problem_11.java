package Chapter_02;

import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println(ch + " is a letter");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is a special character");
        }
    }
}
