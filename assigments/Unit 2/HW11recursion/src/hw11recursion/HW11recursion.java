/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class HW11recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       System.out.println("shirley triangle the pascal");
        int floors;  
        System.out.println("enter the number of floors you want");
        floors= input.nextInt();
        performTriangleThePascal(floors);
    }
    public static void performTriangleThePascal(int floors){
         for (int i=0; i < floors; i++){
          for ( int j = floors; j>i; j--){
              System.out.println(" ");
          }
          int value=1;
          for (int j=0; j<= i; j++){
          System.out.println(value+" ");
          value= value* (i-j)/(j+1);
      }
          System.out.println(" ");
          
         }
    }
}