/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws19.arrays.inspection;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author Shirley
 */
public class SoriaRQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in);
        System.out.println(" ** Sum of 5 Numbers ** ");
         int[] value = new int[5];
        int sum = 0;

        //sum = Add(value, input, sum);
         System.out.println(" The sum is --> " + sum);
        
        Scanner in = new Scanner(System.in);
        System.out.println("** Average of 3 Numbers** ");
        System.out.print(" Enter the first number: ");
        double x = in.nextDouble();
        System.out.print("Enter the second number: ");
        double y = in.nextDouble();
        System.out.print("Enter the third number: ");
        double z = in.nextDouble();
        System.out.print(" Average value is " + average(x, y, z)+"\n" );
       
        System.out.println("Find a number");
        int[] num = {12,23,34,98,87,65,0};
        int toFind = 120;

        boolean found = IntStream.of(num).anyMatch(n -> n == toFind);

        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " isn't found.");
    }	

  public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
private static int Add(int[] value, Scanner input, int sum) {
        for (int y = 0; y < 5; y++) {
            System.out.println("Enter the number" + y + "->");
            value[y] = input.nextInt();
            sum = sum + value[y];
        }
        return sum;
    }
    
}
