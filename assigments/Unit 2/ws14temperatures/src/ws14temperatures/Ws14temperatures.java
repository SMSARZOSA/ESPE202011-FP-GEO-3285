/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws14temperatures;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class Ws14temperatures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner(System.in);
      double temperatures[];
      int n;
     
      
      System.out.println("☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀");
      System.out.println("how many temperatures are you going to enter?");
      n= input.nextInt();
      
     temperatures= new double [n];
     
      for (int i = 0; i < n; i++) {
            System.out.print("Enter the highest temperatures recorded in the world " + (i + 1) + " -> ");
           temperatures[i] = input.nextDouble();
        }
      System.out.println("🐇🐇🐇🐇🐇🐇🐇🐇🐇🐇🐇🐇🐇🐇");
      System.out.println("Rabbits Breeds");
      String[] rabbitsBreeds = {"Blanco de Hotot", "Res", "Cabeza de león",
      "Belier", "English Angora", "Toy or Enano", "Gigante the Flande"};
      for (String rabbits : rabbitsBreeds){
          System.out.println("rabbit breed name" + rabbits);
      }
      System.out.println("📘📘📘📘📘📘📘📘📘📘📘📘📘📘📘📘📘📘📘");
     
       String[] namesOfBooks = {"The Quijote", "The Divine Comedy", "One hundred years of loneliness",
      "Romeo and Julieta", "The war and the peace", "Pride and prejudice", "schizophrenia"};
      for (String books : namesOfBooks){
      System.out.println("the best books you can read" + books);
      }
}
} 