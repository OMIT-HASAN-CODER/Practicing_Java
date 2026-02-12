package Chapter_04;

import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] countries = new String[2][4];

        countries[0][0] = "Bangladesh";
        countries[0][1] = "Dhaka";
        countries[0][2] = "Taka";
        countries[0][3] = "Bangla";

        countries[1][0] = "India";
        countries[1][1] = "Delhi";
        countries[1][2] = "Rupee";
        countries[1][3] = "Hindi";

        int correctCount = 0;
        int wrongCount = 0;

        for (int i = 0; i < countries.length; i++) {
            String countryName = countries[i][0];
            String actualCapital = countries[i][1];
            String actualCurrency = countries[i][2];
            String actualLanguage = countries[i][3];

            System.out.println("Q: What is the capital of " + countryName + "?");
            String userAns = input.nextLine();
            if (userAns.equalsIgnoreCase(actualCapital)) {
                System.out.println("✓ Well done!");
                correctCount++;
            } else {
                System.out.println("X The correct answer should be " + actualCapital);
                wrongCount++;
            }

            System.out.println("Q: What is the currency of " + countryName + "?");
            userAns = input.nextLine();
            if (userAns.equalsIgnoreCase(actualCurrency)) {
                System.out.println("✓ Well done!");
                correctCount++;
            } else {
                System.out.println("X The correct answer should be " + actualCurrency);
                wrongCount++;
            }

            System.out.println("Q: What is the official language of " + countryName + "?");
            userAns = input.nextLine();
            if (userAns.equalsIgnoreCase(actualLanguage)) {
                System.out.println("✓ Well done!");
                correctCount++;
            } else {
                System.out.println("X The correct answer should be " + actualLanguage);
                wrongCount++;
            }
            System.out.println();
        }

        System.out.println("-------------------------");
        System.out.println("Total correct answer: " + correctCount);
        System.out.println("Total wrong answer: " + wrongCount);
    }
}
