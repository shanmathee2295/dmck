/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financial.application;

import java.util.Scanner;

/**
 *
 * @author shanmathee tegerraju
 */
public class FinancialApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the initial tuition fee9(i.e year 1): ");
       int fee=in.nextInt();
       System.out.print("Enter the yearly rate of increment(e.g enter 5.2 for 5.2%): ");
       double rate=in.nextDouble();
       System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
       int year=in.nextInt();
       computeFee(fee,year,rate);
       
    }
    
    public static void computeFee(int fee,int year, double rate){
       double fees= fee*year*rate;
       System.out.println("Computed tition fee for year "+year+" is:"+fees);
       
       
       
       
    }
    
}
