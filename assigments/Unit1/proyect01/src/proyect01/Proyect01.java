/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect01;

import java.util.Scanner;
import static javax.swing.Spring.height;

/**
 *
 * @author Shirley
 */
public class Proyect01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> perimeter of a plot ");
            System.out.println("2. -> area of ​​land");
            System.out.println("3. -> magnitude of an earthquake");
            System.out.println("4. -> tidal range");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    float side1;
                    float side2;
                    float side3;
                    float perimeter;
                    System.out.println("enter side1 -> ");
                    side1 = input.nextFloat();
                    System.out.println("enter side2 -> ");
                    side2 = input.nextFloat();
                    System.out.println("enter side3 -> ");
                    side3 = input.nextFloat();
                    perimeter = side1 + side2 + side3;
                    
                    System.out.println(" the perimeter of a plot is --> " + perimeter);
                    break;
                case 2:
                    float equivalentdistances;
                    float bandwidth;
                    float area;
                    System.out.println(" enter equivalentdistances -> ");
                    equivalentdistances = input.nextFloat();
                    System.out.println("enter bandwidth -> ");
                    bandwidth = input.nextFloat();
                    area = equivalentdistances*bandwidth ;
                    
                    System.out.println("The area of land is -->" + area);
                    break;
                case 3:
                    float amplitude;
                    float timevariation;
                    float magnitude;
                    System.out.println(" amplitude -> ");
                    amplitude = input.nextFloat();
                    System.out.println(" time varation -> ");
                    timevariation = input.nextFloat();
                    magnitude = (float)(Math.log10(amplitude)+ 3 * Math.log10(8 * timevariation)-2.85);
                    
                    System.out.println("The magnitude of an earthquake" + magnitude);
                    break;
                case 4:
                    float tallheight;
                    float lowheight;
                    float amplitude1;
                    System.out.println(" tallheight -> ");
                    tallheight = input.nextFloat();
                    System.out.println(" lowheight -> ");
                    lowheight = input.nextFloat();
                    amplitude1= tallheight - lowheight;
                    
                    System.out.println("tidal range" + amplitude1);
                    break;
                case 5:
                    System.out.println("thanks for using our program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);
    }
    
}
