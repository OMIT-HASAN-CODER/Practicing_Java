package Chapter_03;

import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many product did you buy? ");
        int products = input.nextInt();

         if (products <= 0) {
             System.out.println("Buy some product first.");
         } else {
             System.out.println("Enter their price one by one: ");
             int totalPrice = 0;
             for (int i = 1; i <= products; i++) {
                 totalPrice += input.nextInt();
             }

             int finalPrice = totalPrice +  (int) (totalPrice * 0.15);
             System.out.println("Total price: " + finalPrice);

             int paidAmount = 0;
             int remaining = finalPrice;
             while (remaining > 0) {
                 System.out.println("Please pay the money: ");
                 paidAmount += input.nextInt();

                 if (paidAmount >= finalPrice) {
                     int change = paidAmount - finalPrice;
                     System.out.println("Here is your change: " + change);
                     break;
                 } else {
                     remaining = finalPrice - paidAmount;
                     System.out.println("You have to pay more " + remaining);
                     finalPrice = remaining;
                     paidAmount = 0;
                 }
             }
         }
    }
}
