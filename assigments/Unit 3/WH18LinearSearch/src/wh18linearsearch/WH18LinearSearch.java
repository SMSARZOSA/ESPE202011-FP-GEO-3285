/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh18linearsearch;

import java.util.Scanner;


/**
 *
 * @author Shirley
 */
public class WH18LinearSearch {

    private static String search;

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
         Scanner input= new Scanner(System.in);
        
        int [] mineralPurity = {100, 40, 90, 30, 20, 80, 10, 50, 70, 60};
        int purity;
        int [] clothingPrices = {5, 25, 30, 45, 50, 78, 80, 83, 92, 95, 100, 122};
        int prices;
        int lowPrices= 12 ;
        int hightPrices = 6 ;
        System.out.println("==== Shirley Sarzosa ====");
        System.out.println("==== Linear Search ====");
        System.out.println("enter the purity of the mineral you want to evaluate");
        purity=input.nextInt();
        System.out.println("the purity of the mineral " + purity +
       "the purity of the mineral is in the index: " + search(mineralPurity, purity));
        System.out.println("==== Binary Search ====");
        System.out.println("enter the price you want to search");
        prices= input.nextInt(); 
        System.out.println(  "the price of the clothes is in the index: " 
        + binarySearch(clothingPrices, hightPrices, lowPrices, prices));
       
    }
    public static int search(int elements[], int x){
        int n = elements.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(elements[i] == x){
     return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int  elements[], int left, int right, int x){
  int n = elements.length;
 if(right>=left){  
          int mid = left +(right - left)/2;
          
          if(elements[mid] == x)
              return mid;
          
          if (elements[mid]>x)
              return binarySearch(elements,left,mid-1,x);
          
          return  binarySearch(elements,mid+1,right,x);
        }
        return -1;
 }
        
}

