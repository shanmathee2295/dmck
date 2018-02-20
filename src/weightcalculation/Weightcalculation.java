
package weightcalculation;

import java.util.Scanner;

/**
 *
 * @author shanmathee tegerraju
 */
public class Weightcalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter your weight on Earth(in lbs. e.g 165.9):");
        double weight = in.nextDouble();
        System.out.print("Input-");
        System.out.print("\n\tWeight on Earth: "+ weight+" lbs.");
        System.out.print("\nOutput-");
        System.out.print("\n\tWeight on Mercury: "+ (weight*0.4)+" lbs.");
        System.out.print("\n\tWeight on Venus: "+ (weight*0.9)+" lbs.");
        System.out.print("\n\tWeight on Jupiter: "+ (weight*2.5)+" lbs.");
        System.out.print("\n\tWeight on Saturn: "+ (weight*1.1)+" lbs.");
    }
    
}
