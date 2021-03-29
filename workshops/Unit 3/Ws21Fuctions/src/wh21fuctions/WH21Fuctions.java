/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh21fuctions;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class WH21Fuctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println(" Autor SHIRLEY SARZOSA");
         Scanner input = new Scanner(System.in);
        double frequency= 0;
        double time;
        double numberOfCycles;
        double performance = 0;
        double frequency1;
        double ipc;        
        System.out.println(" Enter the number of Cycles the computer ");
        numberOfCycles= input.nextDouble();
         System.out.println(" enter the time in which you perform the process. ");
        time=  input.nextDouble();
        frequency=calculateTheFrequencyOfAComputer ( numberOfCycles, time);
         System.out.println(" the frequency" + frequency + " Herzio");
         
        System.out.println(" Enter the frequency the computer ");
        frequency1= input.nextDouble();
         System.out.println(" enter the IPC the your computer ");
        ipc=  input.nextDouble();
        performance= calculateThePerformanceOfAComputer (frequency1, ipc);
         System.out.println(" the performance" + performance + " MHZ");
         
    }
    public static double calculateTheFrequencyOfAComputer ( double numberOfCycles, double time){
        double frequency;
        frequency= numberOfCycles/time;
        return frequency;
    }
    public static double calculateThePerformanceOfAComputer ( double frequency1, double ipc){
        double  performance;
        performance= frequency1 * ipc;
        return  performance;
    }
}
