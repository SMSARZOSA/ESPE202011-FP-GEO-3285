/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigments03;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class Assigments03 {

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
            System.out.println("1. -> octagon perimeter");
            System.out.println("2. -> perimeter of the triangle");
            System.out.println("3. -> perimeter of the square");
            System.out.println("4. -> perimeter of the rectangle");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int side1;
                    int perimeter;
                    System.out.println("enter side1 -> ");
                    side1 = input.nextInt();
                    perimeter = side1 * 8;
                    System.out.println(" the octagon perimeter is --> " + perimeter);
                    break;
                case 2:
                    int sidea;
                    int sideb;
                    int sidec;
                    int perimetertriangle;
                    System.out.println("The perimeter of the triangle");
                    System.out.println("enter sidea -> ");
                    sidea= input.nextInt();
                    System.out.println("enter sideb -> ");
                    sideb= input.nextInt();
                    System.out.println("enter sidec -> ");
                    sidec= input.nextInt();
                    perimetertriangle= sidea + sideb + sidec;
                    System.out.println(" perimetertriangle is -->" + perimetertriangle);
                    break;
                case 3:
                    int sidel;
                    int perimetersquare;
                    System.out.println("enter sidel -> ");
                    sidel = input.nextInt();
                    perimetersquare= sidel * 4;
                    System.out.println("The perimeter square is --> " + perimetersquare);
                    break;
                case 4:
                    int base;
                    int height;
                    int perimeterrectangle;
                    System.out.println("enter base -> ");
                    base= input.nextInt();
                    System.out.println("enter height -> ");
                    height= input.nextInt();
                    perimeterrectangle= 2*base + 2*height;
                    System.out.println("The perimeter is --> " + perimeterrectangle);
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
