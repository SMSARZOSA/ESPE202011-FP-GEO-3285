/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment5factorial;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class Assigment5factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double number;
        double factorial=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Give me the number to calculate the factorial: ");
        number=input.nextDouble();
        
        if(number<0)
        {
            System.out.println("Enter a number between 1 and 15");
            System.out.println("Give me the number to calculate the factorial: ");
            number=input.nextDouble();
        }
        if(number>15)
        {
            System.out.println("Enter a number between 1 and 15");
            System.out.println("Give me the number to calculate the factorial: ");
            number=input.nextDouble();
        }
        
        
        while ( number!=0) {
            factorial=factorial*number;
                number--;
                }
        
        System.out.println("the factorial is: "+factorial);
        
    }
 
}
