/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshops05iterations;

/**
 *
 * @author Shirley
 */
public class Workshops05iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int i;
            i=0; //variable
            final float pi= 3.14F; //Constante
            
            System.out.println("first even numbers ");
            while( i < 10){
                System.out.println("i ->" + (i + 1 ));
                // i +=1;
                i++;
                // i= i+1;
            }
                System.out.println("first 5 even numbers ");
                i=2;
                while (i<=10){
               System.out.println(i + " -> is even ");
               i+=2;
                }
                System.out.println("first 5 odd numbers");
                int stop;
                stop=20;
                for(int j=1; j<10;j+=2){
                    System.out.println("odd number ->" + j);
                }
                System.out.println( "multiplication tables ; 7" );
                int top=12;
                int product=0;
                int table= 7;
                for (int j=1 ; j <= top ; j++){
                    product= table* j;
                    System.out.println(" 7 * " + j + " = " + product);
                    
                }
        String number = null;
            
        //7.7 ->float
        // 7 -> int or float
        String realNumber;
        realNumber = number;
           System.out.println("integer number --> " + number);
           System.out.println("float realNumber --> " + realNumber) ;   
           realNumber = 6.7F;
           
    }
    
}
