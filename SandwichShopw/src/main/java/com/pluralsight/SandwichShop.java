package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Sandwich size selection
        System.out.println(" Select the size of the sandwich: ");
        System.out.println("(A)Regular: base price $5.45");
        System.out.println("(B)Large: base price $8.95");
        String chooseSize = scanner.nextLine();

        float basePrice = 0;
        if (chooseSize.equals ("A")) {
            basePrice = 5.45f;
        } else if (chooseSize.equals("B")) {
            basePrice = 8.95f;
        }

        // ask for Age
        System.out.print( "What is your age? ");
        int age = scanner.nextInt();

        float discount = 0;
        if(age <=17) {
            discount = 0.10F;
        } else if (age>=65) {
            discount = 0.20F;
        }

        //Total price post discount 
        float totalCost= basePrice - (basePrice * discount);

        // Get a Result
        System.out.println(" The cost of your sandwich with the discount is: $" + totalCost);


    }
}