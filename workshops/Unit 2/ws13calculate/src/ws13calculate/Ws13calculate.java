/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13calculate;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class Ws13calculate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double base;
        double height;
        double area,area2,area3;
        double radio;
        double generatrix;
        double speedf,speedo,acceleration,time;
        double angularvelocity,period;
        double accelerationC,speed;
        System.out.println("=====triangle area=======");
        System.out.println("insert the base number");
        base=input.nextDouble();
        System.out.println("insert height ");
        height=input.nextDouble();
        area=calculateTheAreaOfTheTriangle(base,height);
        System.out.println("areaTriangle"+area);
        
        System.out.println(" =======area of ​​a cylinder=====");
        System.out.println("isert the radio");
        radio=input.nextDouble();
        System.out.println("isert the height");
        height=input.nextDouble();
        area2=calculateTheAreaOfTheCylindre(radio,height);
        System.out.println("areacylinder"+area2);
        System.out.println("=========area of ​​a cone=======");
        System.out.println("isert the generatrix");
        generatrix=input.nextDouble();
        System.out.println("isert the radio");
        radio= input.nextDouble();
        area3= calculateTheAreaOfTheCone(radio,generatrix);
        System.out.println("areacylinder"+area3);
        System.out.println("=========formula to get the acceleration=======");
        System.out.println("isert the final speed");
        speedf=input.nextDouble();
        System.out.println("isert the initial velocity");
        speedo= input.nextDouble();
        System.out.println("isert the time");
        time=input.nextDouble();
        acceleration= takeOffTheAcceleration(speedf,speedo,time);
        System.out.println("acceleration"+ acceleration);
        System.out.println("=========formula to get the period at l angular velocity=======");
        System.out.println("isert the angular velocity");
        angularvelocity=input.nextDouble();
        period= takeOffThePeriod(angularvelocity);
        System.out.println("period" + period);
        System.out.println("=========centripetal acceleration=======");
        System.out.println("isert the speed");
        speed=input.nextDouble();
        System.out.println("isert the radio");
        radio= input.nextDouble();
        accelerationC=takeOffTheCentripetalAcceleration(speed,radio);
        System.out.println(" accelerationC" +  accelerationC);
         
        
        
        
        
    }
   public static double calculateTheAreaOfTheTriangle(double base, double height){
   double area=0.0f;
   area= (base*height)/2;
   return area;
   }
   public static double calculateTheAreaOfTheCylindre(double radio, double height){
   double area2=0.0f;
   area2= (2*3.14*radio)*(radio+height);
   return area2;
   }
   public static double calculateTheAreaOfTheCone(double radio, double generatrix){
   double area3=0.0f;
   area3= 3.14*radio*generatrix;
   return area3;
   }
   public static double takeOffTheAcceleration(double speedf,double speedo,double time){
   double acceleration=0.0f;
   acceleration= (speedf-speedo)/time;
   return acceleration;
   }
   public static double takeOffThePeriod(double angularvelocity){
   double period=0.0f;
   period= (2*3.14)/angularvelocity;
   return period;
   }
    public static double takeOffTheCentripetalAcceleration(double speed, double radio){
   double accelerationC=0.0f;
   accelerationC= (speed*speed)/radio;
   return accelerationC;
}
}