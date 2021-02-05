/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw09.embeddedstructures;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class HW09EmbeddedStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double number;
        double operator;
        double operator2;
        double result;                                    
        double residue;
        double product;
        double stop =12;
        int option = 6 ; 
        double k;
      do {
       
       System.out.print("Enter First Number: ");
       operator = teclado.nextInt();
       System.out.print("Enter Second Number: ");
       operator2 = teclado.nextInt();
       
        System.out.println( " ================================ ");
        System.out.println( " Numbers Multiple of 2 ");
        if(operator % 2 == 0) {
        System.out.println(operator+" Even Number .");
                      
        if(operator2 % 2 == 0) {
            System.out.println(operator2+" Even Number .");
          
       result=operator*operator2;
       System.out.println( " The Multiplicacion of "  + operator +  " * "  + operator2+ " Is Equal to  " + result);
        
        }else{
            System.out.println(operator2+" NOT Even Number .");
        }
        }else {
            System.out.println(operator+" NOT Even Number .");
        }
        
         System.out.println( " ================================ ");
        System.out.println( " Numbers Multiple of 3 ");
         
        if(operator % 3 == 0) {
            System.out.println(operator+" Multiple of 3 .");
                      
        if(operator2 % 3 == 0) {
            System.out.println(operator2+" Multiple of 3 .");
            
       result=operator+operator2;
       
       System.out.println( " The Add of "  + operator +  " + "  + operator2+ " Is equal to " + result);
        
          }else{
            System.out.println(operator2+" NOT Multiple of 3 .");
        }
        }else {
            System.out.println(operator+" NOT Multiple of 3 .");
        }
        
         System.out.println( " ================================ ");
         
          System.out.println( " Numbers Multiple of 7 ");
        if(operator % 7 == 0) {
            System.out.println(operator+" Multiple of 7 .");
                      
        if(operator2 % 7 == 0) {
            System.out.println(operator2+" Multiple of 7 .");
            
           residue = operator % operator2;            
       System.out.println("The Module" + " " + operator + " % " + operator2 + " " + 
               "is iqual to" + " " + (operator % operator2));  
         
        }else{
            System.out.println(operator2+" NOT Multiple of 7 .");
        }
        }else {
            System.out.println(operator+" NOT Multiple of 7 .");
        }
        
        System.out.println( " ================================ ");
        
        System.out.println( " Numbers Multiple of 11 ");
        
            if(operator % 11 == 0) {
            System.out.println(operator+" Multiple of 11 .");
                      
        if(operator2 % 11 == 0) {
            System.out.println(operator2+" Multiple of 11 .");
            
                
           for (k = 1;k <= stop; k++) {
          product = k * operator;
          System.out.println(k+ " x " + operator + " = " + product);
           }
           for (k = 1;k <= stop; k++) {
          product = k * operator2;
          System.out.println(k+ " x " + operator2 + " = " + product);
           }
        }else{
            System.out.println(operator2+" NOT Multiple of 11 .");
        }
        }else {
            System.out.println(operator+" NOT Multiple of 11 .");
        }
      
            System.out.println( " ================================ ");
            
         System.out.println( " Numbers Multiple of 13 ");
         
        if(operator % 13 == 0) {             
        System.out.println(operator+" Multiple of 13 .");
        
        
            
         if(operator2 % 13 == 0) {             
        System.out.println(operator2+" Multiple of 13 .");         
        
       result = operator / operator2;            
       System.out.println(" The Division between " + " " + operator + " / " + operator2 + " " + 
               " is iqual to " + " " + (operator/ operator2));  
        }else{
          System.out.println(operator2 + " NOT Multiple of 13 .");  
        }
        }else{
            System.out.println(operator + " NOT Multiple of 13 .");
            
        }        
     
    }    while (option != 6);
       
      
        
        

       
        
       
        
        
    
    }
}

    

 