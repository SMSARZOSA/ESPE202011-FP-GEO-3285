/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh19;

import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Shirley
 */
public class WH19 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in );
         int integersToSort[], nElements, aux;
         nElements = Integer.parseInt(JOptionPane.showInputDialog("type the number of elements you are going to enter:"));
         
         integersToSort = new int[nElements];
         for(int i=0;i<nElements; i++){
             System.out.print((i + 1)+ " . Enter a Number");
            integersToSort[i] = input.nextInt();
         }
           for(int i=0;i<(nElements - 1); i++){
               for(int j=0;j<(nElements -1); j++){
                   if(integersToSort[j] > integersToSort[j+1]){
                       aux= integersToSort[j];
                       integersToSort[j] = integersToSort[j+1];
                       integersToSort[j+1] = aux;
                   }                      
               }               
           }      
    
    System.out.println("ordered in increasing order");
    for(int i=0;i<nElements; i++){
        System.out.print(integersToSort[i]+"   ");
        
    }
    System.out.println("");
   

    }
    public static void Order(int[] integersToSort ){
        for (int i=1; i < integersToSort.length; i++){
            int aux = integersToSort[i];
            int pos = i;
            while ((pos > 0) && (integersToSort[pos - 1] > aux)){
                integersToSort[pos] = integersToSort[pos - 1];
                pos --;
            }
            integersToSort[pos]=aux;
        }
    }
}