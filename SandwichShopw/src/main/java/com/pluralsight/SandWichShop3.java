package com.pluralsight;
import java.util.Scanner;

public class SandWichShop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // prompt the user for the size of the sandwich
        System.out.println(" Select the size of the sandwich");
        System.out.println("(1)Regular base price is $5.45");
        System.out.println("(2)Large base price is  $8.95");

        String chooseSize = scanner.nextLine();

        float basePrice = 0;
        if (chooseSize.equals("1")) {
            basePrice = 5.45f;
        } else if (chooseSize.equals("2"))
            basePrice = 8.95f;


        //Ask for age
        System.out.println("What is your age");
        int age = scanner.nextInt();

        float discount = 0;
        if (age <=17) {
         discount = 0.10f;
        }else if (age >= 65 ) {
            discount = 0.20f;
        }

        // establish the totalCost
        float totalCost = basePrice - (basePrice * discount);


        // Print result
        System.out.println(" Your total cost with the discount is: $" + totalCost);

    }
}
