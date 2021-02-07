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
        System.out.println("shirley triangle the pitágoras");
        int floors;
        int []arreglo= new int[1];
        System.out.println("floors numbers");
        floors=input.nextInt();
        
        for (int i=1; i<= floors; i++){
          int[]pascal= new int [i];
          
          for(int j= floors; j>i; j--){
              System.out.println("");
          }
          for (int k=0; k< i; k++){
              if(k==0 || k==(i -1)) {
              pascal[k]=1;
              }else{
                  pascal[k]=arreglo[k] + arreglo[k-1];
        }
              
         System.out.println("[" +pascal[k]+ "]");
         System.out.println();
          }
          arreglo= pascal;
          System.out.println();
         
        }
    

    }
}

          
        
        
    