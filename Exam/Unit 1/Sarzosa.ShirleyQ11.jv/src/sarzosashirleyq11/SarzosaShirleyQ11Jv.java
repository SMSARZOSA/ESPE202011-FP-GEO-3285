/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarzosashirleyq11;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class SarzosaShirleyQ11Jv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        
        int number,number1;
         int solution;
        
        
        int i;
        
        do{
            
            System.out.println("Enter the number of the multiplicacion table to display - > ");
            number=sc.nextInt();
            i=1;
        do
        {  
            solution= i*number;
            System.out.println(number+"*"+i+"->"+solution);
            i++;
            
                        
        }
        while(i<13);
        System.out.println("If you want to enter a number,enter 1, otherwise enter 0 ");
            number1=sc.nextInt();
            if(number1==0)
            {
                System.out.println("Exiting...");
            }
            
        }while(number1!=0);
    }
    
}
