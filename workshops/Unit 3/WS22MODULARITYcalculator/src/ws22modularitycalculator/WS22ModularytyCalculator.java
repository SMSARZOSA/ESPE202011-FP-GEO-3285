/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws22modularitycalculator;

import java.util.Scanner;
import utils.BasicOperation;

/**
 *
 * @author Shirley
 */
public class WS22ModularytyCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float operand1;
        float operand2;
        float result;
        Scanner input = new Scanner(System.in);
        System.out.println("====ADDITION===");
        System.out.println("ENTER TWO NUMBERS");
        operand1=input.nextFloat();
        operand2=input.nextFloat();
        System.out.println("== ADDITION ==");
        result= BasicOperation.addTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "+" + operand2 + "=" + result);
        System.out.println("== SUBTRACTION ==");
        result= BasicOperation.subtractTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "-" + operand2 + "=" + result);
        System.out.println("== multiplication ==");
        result= BasicOperation.multiplyTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "*" + operand2 + "=" + result);
         System.out.println("== DIVISION ==");
        result= BasicOperation.divideTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "/" + operand2 + "=" + result);
        
          
    }
    
}
