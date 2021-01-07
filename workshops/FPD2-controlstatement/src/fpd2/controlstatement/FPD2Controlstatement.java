/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpd2.controlstatement;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class FPD2Controlstatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter an integer-->");
    int n= scanner.nextInt();
    System.out.println("You entered-->"+n);
    int remainder=n%2;
    if(remainder==0)
    {  System.out.println(n+"is even");
    }
    else
    {  System.out.println(n+"is odd");
    }
    }
}
    
