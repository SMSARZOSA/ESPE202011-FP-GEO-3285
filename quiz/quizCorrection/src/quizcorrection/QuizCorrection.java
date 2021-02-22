/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizcorrection;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class QuizCorrection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int namesOfProducts = 0;
        String[] products;
        float[] productPrices;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" enter how many products you want to save -> ");
        namesOfProducts = scanner.nextInt();

        products = new String[namesOfProducts];
         productPrices = new float[namesOfProducts];

        for (int i = 0; i < namesOfProducts; i++) {
            scanner.nextLine();
            System.out.print(" Please Enter the name of products # " + i + " -> ");
            products[i] = scanner.nextLine();
            System.out.print(" Please enter " + products[i] + " product Prices ->");
             productPrices[i] = scanner.nextFloat();
        }

        System.out.println(" products    ->  \t     product prices ");

        for (int i = 0; i < namesOfProducts; i++) {
            System.out.println(products[i] + " ->  \t " +  productPrices[i]);
}
    }
    
}
