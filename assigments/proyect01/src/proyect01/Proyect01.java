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
                    int side1;
                    int side2;
                    int side3;
                    int perimeter;
                    System.out.println("enter side1 -> ");
                    side1 = input.nextInt();
                    System.out.println("enter side2 -> ");
                    side2 = input.nextInt();
                    System.out.println("enter side3 -> ");
                    side3 = input.nextInt();
                    perimeter = side1 + side2 + side3;
                    
                    System.out.println(" the perimeter of a plot is --> " + perimeter);
                    break;
                case 2:
                    int equivalentdistances;
                    int bandwidth;
                    int area;
                    System.out.println(" enter equivalentdistances -> ");
                    equivalentdistances = input.nextInt();
                    System.out.println("enter bandwidth -> ");
                    bandwidth = input.nextInt();
                    area = equivalentdistances*bandwidth ;
                    
                    System.out.println("The area of land is -->" + area);
                    break;
                case 3:
                    int amplitude;
                    int timevariation;
                    int magnitude;
                    System.out.println(" amplitude -> ");
                    amplitude = input.nextInt();
                    System.out.println(" time varation -> ");
                    timevariation = input.nextInt();
                    magnitude = (int)(Math.log10(amplitude)+ 3 * Math.log10(8 * timevariation)-3);
                    
                    System.out.println("The magnitude of an earthquake" + magnitude);
                    break;
                case 4:
                    float tallheight;
                    float lowheight;
                    float amplitude1;
                    System.out.println(" tallheight -> ");
                    tallheight = input.nextInt();
                    System.out.println(" lowheight -> ");
                    lowheight = input.nextInt();
                    amplitude1= tallheight - lowheight;
                    
                    System.out.println("tidal range" + amplitude1);
                    break;
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);
    }
    
}
