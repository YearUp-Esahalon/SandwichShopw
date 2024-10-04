package com.pluralsight;
import java.util.Scanner;

public class SandwichShop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Sandwich size selection
        System.out.println("Select the size of the sandwich ");
        System.out.println("1: Regular base price $5.45");
        System.out.println("2: Large base price is $8.95");

        int size = scan.nextInt();
        float basePrice = 0;
        float loadedPrice = 0;

        //Base price based pon size
        if (size == 1) {
        basePrice = 5.45f;
        loadedPrice = 1.00f;
       } else if (size == 2) {
          basePrice = 8.95f;
          loadedPrice = 1.75f;

            //loaded option
            System.out.println(" Would you like the sandwich loaded? (yes or no): ");
            double totalCost = basePrice + (scan.next().trim().toLowerCase().startsWith("y") ? loadedPrice : 0);

            // Prompt for age and apply discount
            System.out.print("Please enter your age: ");
            int age = scan.nextInt();
            totalCost *= (age <= 17) ? 0.90 : (age >= 65) ? 0.80 : 1.00; // Apply discount based on age

            // Display the final cost
            System.out.printf("The total cost of your sandwich is: $%.2f%n", totalCost);



        }

    }
}
