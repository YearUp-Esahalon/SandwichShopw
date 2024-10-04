package com.pluralsight;

import java.util.Scanner;

public class SandwichShop4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // prompt the user for the size of the sandwich

        System.out.println(" Choose your size for the sandwich");
        System.out.println(" 1:Regular: base price is $5.45");
        System.out.println(" 2: Large: base price is $8.95");

        int size = scanner.nextInt();
        float basePrice = 0;
        float loadedPrice =0;

        //establish price on size and if loaded

        if(size == 1) {
            basePrice = 5.45f;
            loadedPrice = 1.00f;
        } else if (size == 2) {
            basePrice = 8.95f;
            loadedPrice = 1.75f;

            System.out.println( " Would you like you sandwich loaded? (YES OR NO):");
            float totalCost = basePrice + loadedPrice

        }





        }







    }




