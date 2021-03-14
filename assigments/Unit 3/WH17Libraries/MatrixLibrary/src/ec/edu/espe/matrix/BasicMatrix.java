/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.matrix;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class BasicMatrix {
    public static void printMatrixSubtraction(int[][] a, int[][] b, int[][] c) {
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
     public static void printMatrixSum(int[][] a, int[][] b, int[][] c) {
        for (int i = 0; i< a.length; i++){
            for (int j = 0; j< a.length; j++){
                System.out.print("[" + a[i][j] + "]");
            }
            
            if(i == 1){
                System.out.print("   +   ");
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
public static int[][] addTwoMatrices(int m, int n, int[][] a, int[][] b) {
        int[][] c;
        c = new int [m][n];
        
        for(int i=0; i< m; i++){
            for (int j=0; j< n; j++){
               c[i][j] = a[i][j]+b[i][j]; 
            }
        }
        return c;
    }
public static int[][] multiplyByTwoAndAddTwoMatrices(int m, int n, int[][] a, int[][] b) {
        int[][] c;
        c = new int [m][n];
        
        for(int i=0; i< m; i++){
            for (int j=0; j< n; j++){
               c[i][j] = (2)*a[i][j]+(2)*b[i][j]; 
            }
        }
        return c;
    }
}

