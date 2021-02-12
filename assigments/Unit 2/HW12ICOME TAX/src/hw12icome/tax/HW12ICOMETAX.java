/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12icome.tax;

import java.util.Scanner;

/**
 *
 * @author Shirley
 */
public class HW12ICOMETAX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double purchase;
        double IVA;
        double money;
        double value;
        double basicfraction;
        double taxonthebasicfraction;
        double surplusfraction;
        double outcome=0;
        double sum=0;
        double percentage;   
        System.out.println("Add the total value of your purchase");
        purchase= input.nextDouble();
        IVA= valueAddedTax( purchase);
        System.out.println("iva"+IVA);
        System.out.println("insert the amount of money you are going to use");
        money= input.nextDouble(); 
        System.out.println("====<3====");
        if(money >= 5000){
        System.out.println("enter the amount of money you are going to use");
        IVA= enterTaxAtTheExitOfCurrency (money);
        
        System.out.println("iva"+ IVA);
        }else{
        System.out.println("you do not pay taxes for the exit of foreign currency");
        
       System.out.println("=================");
       value=input.nextDouble();
        System.out.println("enter a value");
   if(value>=0 && value<11290){
   basicfraction=0;
   taxonthebasicfraction=0;
   surplusfraction=0;
   outcome=value-basicfraction;
   percentage=outcome*surplusfraction;
   sum=percentage+taxonthebasicfraction;
   System.out.println(" outcome: "+outcome);
         }
   if(value>=11290 && value<14390){
   basicfraction=11290;
   taxonthebasicfraction=0;
   surplusfraction=0.5;
   outcome=value-basicfraction;
   percentage=outcome*surplusfraction;
   sum=percentage+taxonthebasicfraction;
   System.out.println(" outcome: "+outcome);
   
   
   }
   if(value>=14390 && value< 17990){
   basicfraction=14390;
   taxonthebasicfraction=155;
   surplusfraction=0.10;
   outcome=value-basicfraction;
   percentage=outcome*surplusfraction;
   sum=percentage+taxonthebasicfraction;
   System.out.println(" outcome: "+outcome);
   }
   if(value>=17990 && value< 21600){
   basicfraction=17990;
   taxonthebasicfraction=515;
   surplusfraction=0.12;
   outcome=value-basicfraction;
   percentage=outcome*surplusfraction;
   sum=percentage+taxonthebasicfraction;
   System.out.println(" outcome: "+outcome);
   }
    if(value>=21600 && value< 43190){
    basicfraction=21600;
    taxonthebasicfraction=948;
    surplusfraction=0.15;
    outcome=value-basicfraction;
    percentage=outcome*surplusfraction;
    sum=percentage+taxonthebasicfraction;
    System.out.println(" outcome: "+outcome);
   }
    if(value>=43190 && value< 64770){
    basicfraction=43190;
    taxonthebasicfraction=4187;
    surplusfraction=0.20;
    outcome=value-basicfraction;
    percentage=outcome*surplusfraction;
    sum=percentage+taxonthebasicfraction;
    
     System.out.println(" outcome: "+outcome);
   }
    if(value>=64770 && value<86370 ){
    basicfraction=64770;
    taxonthebasicfraction=8503;
    surplusfraction=0.25;
    outcome=value-basicfraction;
    percentage=outcome*surplusfraction;
    sum=percentage+taxonthebasicfraction;
    
     System.out.println(" outcome: "+outcome);
   }
   
    if(value>=86370 && value<115140){
    basicfraction=86370;
    taxonthebasicfraction=13903;
    surplusfraction=0.30;
    outcome=value-basicfraction;
    percentage=outcome*surplusfraction;
    sum=percentage+taxonthebasicfraction;
    
     System.out.println(" outcome: "+outcome);
   }
       
        
              
   
    }
}

    
    public static double valueAddedTax( double purchase ){
    double IVA=0.0F;
    IVA= purchase*0.12;
    return IVA;
}
    public static double enterTaxAtTheExitOfCurrency(double money){
    double IVA=0.0F;
    IVA= money * 0.05;
    return IVA;
    }
    public static double enterIncomeText(){
    double value;
    double fb;//fraccion basca
    double ifb;//IMPUESTO FRACCION BASICA
    double ife;//IMPUESTO FRACCION EXEDENTE
    double result;
    double percent;
    double sum = 0;
    Scanner entrada =new Scanner (System.in);
    System.out.println("enter the number: ");
         value = entrada.nextInt();
         if(value >=0 && value <11290){
         ifb=0;
         ife=0;
         fb=0;
         result=value-fb;
         percent= result*ife;
         sum=percent+ifb;
         System.out.println("RESULT : "+sum);
         }
         if(value >=11290 && value <14390){
         ifb=0;
         ife=0.05;
         fb=11290;
         result=value-fb;
         percent= result*ife;
         sum=percent+ifb;
         System.out.println("RESULT : "+sum);
         }
          if(value >=14390 && value <17990){
         ifb=155;
         ife=0.10;
         fb=14390;
         result=value-fb;
         percent= result*ife;
         sum=percent+ifb;
         System.out.println("RESULT: "+sum);
         }
           if(value >=17990 && value <21600){
         fb=17990;
         ifb=515;
         ife=0.12;
         
         result=value-fb;
         percent= result*ife;
         sum=percent+ifb;
         System.out.println("RESULT: "+sum);
         }
         if(value >=21600 && value <43190){
         fb=21600;
         ifb=948;
         ife=0.15;
         
         result=value-fb;
         percent= result*ife;
         sum=percent+ifb;
         System.out.println("RESULT: "+sum);
         }
          if(value >=43190 && value <64770){
         fb=43190;
         ifb=4187;
         ife=0.20;
         
         result=value-fb;
         percent= result*ife;
         sum=percent+ifb;
         System.out.println("RESULT: "+sum);
         }
           if(value >=64770 && value <86370 ){
         fb=64770;
         ifb= 8503;
         ife=0.25;
         
         result=value-fb;
         percent= result*ife;
         sum=percent+ifb;
         System.out.println("RESULT: "+sum);
         }
            if(value >=86370 && value <115140){
         fb=86370;
         ifb=13903;
         ife=0.30;
         
         result=value-fb;
         percent= result*ife;
         sum=percent+ifb;
         System.out.println("RESULT: "+sum);
         }
      
         
    return sum;
    }
   }
 


    