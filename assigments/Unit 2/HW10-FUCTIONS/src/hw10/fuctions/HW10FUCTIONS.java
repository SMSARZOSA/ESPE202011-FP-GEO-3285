/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.fuctions;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class HW10FUCTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
       
        double dividend;
        double divider;
        double quotient;
        double variablex,variablex1;
        double number,range;
        
       System.out.println("insert two numbers for division");
       dividend= input.nextDouble();
       divider= input.nextDouble();
       quotient=divideTwoNumbers(dividend,divider);
       
       System.out.println(" The Division between " + " " + dividend + " / " + divider + " " + 
               " is iqual to " + " " + quotient);  
       
       System.out.println("enter the value of the variablex .. ");
       variablex= input.nextDouble();
       System.out.println(" the fuction f(x) gives as an answer --> " + fuction1(variablex));
       
        System.out.println("enter the value of the variablex1 .. ");
       variablex1= input.nextDouble();
       System.out.println(" the fuction g(x) gives as an answer --> " + fuction2(variablex1));
       
       System.out.println("enter the number from the multiplication table .. ");
       number= input.nextDouble();
       System.out.println("enter the range from the multiplication table .. ");
       range= input.nextDouble();
      MULTIPLICATIONTABLE(number,range);
       
               
       
       
       
       
       
         
                 
         
                 
    }
    public static double divideTwoNumbers(double dividend, double divider) {
        double quotient = 0;
        quotient = dividend / divider;

        return quotient;         
    }
    public static double fuction1(double variablex ){
    double variabley;
    variabley=variablex*variablex;
    return variabley;
    
}
    public static double fuction2(double variablex){
        return variablex * variablex +2 *variablex + 1;
    }
    public static void MULTIPLICATIONTABLE(double number, double range){
       double answer;
       
       
        for (int i=0; i<= range; i=i+1){
            answer=number*i;
            System.out.println(" the multiplication of "+ number + "*" + i + "-->"+ answer);
        
        
    }
}
}