/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh15.matrixsubtraction;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class WH15MatrixSubtraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int [][] a;
    int [][] b;
    int [][] c;
    
    int m=0;
    int n=0;
    
    
    Scanner input=new Scanner(System.in);
    
    System.out.println(" AUTHOR: SHIRLEY SARZOSA");
    System.out.println("Enter the matrix dimensions"); 
    System.out.println("\n m -> ");
    m=input.nextInt();
    System.out.println("\n n -> ");
    n=input.nextInt();
    
    a= new int[m][n];
    b= new int[m][n];
    c = new int[m][n];
    
    
    System.out.println("----MATRIX A----");
   for(int i=0; i < m; i++){
       for (int j=0; j < n; j++){
      a[i][j] = input.nextInt(); 
       }
   }
    System.out.println("----MATRIX B----");
    for(int i=0; i < m; i++){
       for (int j=0; j < n; j++){
      b[i][j] = input.nextInt(); 
       }
   }
    System.out.println("----MATRIX C(resulting)----");
    for(int i=0; i < m; i++){
       for (int j=0; j < n; j++){
      c[i][j] = a[i][j]-b[i][j]; 
       }
   }
     
    for (int i = 0; i< a.length; i++){
        for (int j = 0; j< a.length; j++){
             System.out.print("[" + a[i][j] + "]");
    }
        
    if(i == 1){
        System.out.print("   -   ");
    }else{
        System.out.print("       ");
        
    }
    for (int j = 0; j< b.length; j++){
        System.out.print("[" + b[i][j] + "]");
    }
     if(i == 1){
        System.out.print("   =   ");
    }else{
        System.out.print("       ");
     }
     for (int j = 0; j< c.length; j++){
             System.out.print("[" + c[i][j] + "]");
     }
    System.out.println("");
    
    }
  }
}
    
    

