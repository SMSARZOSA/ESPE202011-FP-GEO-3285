/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh16matrixoperation;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class WH16MatrixOperation {

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
    System.out.println("Enter the matrix dimensions"); 
    System.out.println("\n m -> ");
    m=input.nextInt();
    System.out.println("\n n -> ");
    n=input.nextInt();
    
    a= new int[m][n];
    b= new int[m][n];
    c = new int[m][n];
    
    
    System.out.println("----MATRIX A----");
     a=readMatrixElements(m, n, "A",input);
    System.out.println("----MATRIX B----");
    b=readMatrixElements(m, n, "A",input);
    System.out.println("----The Subtraction MATRIX Subtraction ----");
    c= restartTwoMatrices( m, n, a, b);
        printMatrix(a, b, c);
    
  
    }

    private static void printMatrix(int[][] a, int[][] b, int[][] c) {
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

    
    
    public static int[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        int [][] matrix;
        matrix=new int [m][n];
        for(int i=0; i< m; i++){
            System.out.println("--Row Numbers" + (i+1) + "--");
        for(int j=0; j< n; j++){
             System.out.print(matrixName + "[" + (i+1) + "][" + (j+1)+ "] ->");
             matrix[i][j] = input.nextInt();
        }
        }
        return matrix;
        }
         public static int[][] restartTwoMatrices(int m, int n, int[][] a, int[][] b) {
        int[][] c;
        c = new int [m][n];
        
        for(int i=0; i< m; i++){
            for (int j=0; j< n; j++){
               c[i][j] = a[i][j]-b[i][j]; 
            }
        }
        return c;
    }

}