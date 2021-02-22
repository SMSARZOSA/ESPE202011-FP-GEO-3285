/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);
         int [] products;
         float[] prices;
         int numberDates;
       
         
         
          System.out.println("how many products are you going to enter");
          numberDates= input.nextInt();
           System.out.println("Enter the name of products");
          products = new int[ numberDates];
     
          for (int i = 0; i < numberDates; i++) {
           System.out.print("enter the name of products " + (i + 1) + " -> ");
           products[i] = input.nextInt();
            
        }
          System.out.println("insert product prices");
           
          prices = new float[ numberDates];
         for (int i = 0; i < numberDates; i++) {
           System.out.print("enter the name of products " + (i + 1) + " -> ");
           prices[i] = input.nextInt(); 
          
           
        
          
    }
       
}
}