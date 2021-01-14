/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigments02iterations;

/**
 *
 * @author Shirley
 */
public class Assigments02iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i;
        i = 0;

        System.out.println("==== This is a while loop from 1 to 41 ====");

        while (i < 41 ) {
            System.out.println("i -> " + (i + 1));
            i++;
             }
        
        System.out.println("Multiplication Tables : 41");
        int top=12;
        int product=0;
        int table = 41;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println(" 41 * " + j + " = " + product);
        }
           
        System.out.println(" downward collation from 20 to 1 ");
        int start=20;
        int stop=1;
        for(int j=20 ; j>=stop ; j--){
            System.out.println(j);
        }
    }
}
    

