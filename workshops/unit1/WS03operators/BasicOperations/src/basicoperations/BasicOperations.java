/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author Shirley
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int difference;
        
        int factor1;
        int factor2;
        int product; 
        
        int dividend;
        int divider;
        int quotient;
        
        int remainder;
        
        
        dividend=8;
        divider=6;
        
        factor1= 5;
        factor2= 3;
        
        minuend= -23;
        subtrahend= -6;
        
        addend1 = 5;
        addend2 = 18;
        
        sum = addend1 + addend2;
        product= factor1*factor2;
        quotient= dividend/divider;
        remainder= dividend%divider;
        
        System.out.println("the addition of" + addend1 + " + " + addend2 + " is equal to --> "+ sum);
        
        ++sum;
        System.out.println("sum is equal to --> " + sum);
        sum++;
        System.out.println(" sum is equal to --> " + sum);
        System.out. println(" adding one to sum " + (sum++));
        System.out.println("ading one to sum " + ((++sum)));
        System.out.println("the subtraction of" + minuend + " - "+ subtrahend + " is equal to " + (minuend - subtrahend));
        System.out.println(" the multiplication of " + factor1 + " * " + factor2 + " is equal to " + product );
      System.out.println("the division of " + dividend + " / " + divider + " is equal to " + quotient );
      System.out.println("the remainder of " + dividend + " % " + divider + " is equal to " + remainder );
    }
    
}
