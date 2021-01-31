/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numer of the multiplicacion table to display - > ");
        
        int number;
         int solution;
        
        number=sc.nextInt();
        for(int i=1; i<13;i++)
        {  
            solution= i*number;
            System.out.println(number+"*"+i+"->"+solution);
        }
        
    }
    }
    

