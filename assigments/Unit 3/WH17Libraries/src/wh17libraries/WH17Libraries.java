/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh17libraries;

import ec.edu.espe.matrix.BasicMatrix;
import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class WH17Libraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int [][] a;
    int [][] b;
    int [][] c;
    int m=0;
    int n=0;
    a= new int[m][n];
    b= new int[m][n];
    c = new int[m][n];
    
    System.out.println("== Shirley Sarzosa MATRIX LIBARIES==");
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the matrix dimensions"); 
    System.out.println("\n m -> ");
    m=input.nextInt();
    System.out.println("\n n -> ");
    n=input.nextInt();
     
    System.out.println("----MATRIX A----");
        String matrixName = null;
    a= BasicMatrix.readMatrixElements(m, n, matrixName, input);
    System.out.println("----MATRIX B----");
    b= BasicMatrix.readMatrixElements(m, n, matrixName, input);
    System.out.println("----The Subtraction MATRIX  ----");
    c = BasicMatrix.restartTwoMatrices(m, n, a, b);
    BasicMatrix.printMatrixSubtraction(a, b, c);
    System.out.println("----The Addition MATRIX ----");
    c= BasicMatrix.addTwoMatrices(m, n, a, b);
    BasicMatrix.printMatrixSum(a, b, c);
    System.out.println("----Sum Of Two Matrices Multiplied Two To Each Matrix ----");
    c= BasicMatrix.multiplyByTwoAndAddTwoMatrices(m, n, a, b);
    BasicMatrix.printMatrixSum(a, b, c);
        
     
    }
    
}
