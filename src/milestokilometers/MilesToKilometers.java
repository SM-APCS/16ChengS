/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestokilometers;

/**
 *
 * @author spenc_000
 */
import java.util.Scanner;
public class MilesToKilometers {

    /**
     * @param args the command line arguments
     */
    //-------------------------------
    //Converts Miles to Kilometers
    //-------------------------------
    public static void main(String[] args) {
        // TODO code application logic here
        double miles = 1.0;
        double ConversionFactor = 1.60934;
       
        System.out.println("One mile is " + (miles * ConversionFactor) + " kilometers");
        miles = 23.0;
        System.out.println("Twenty three miles is equal to " + (miles * ConversionFactor) + " kilometers");
        System.out.print("Please input number of miles to convert to kilometers: ");
        // Takes the input of miles and converts to kilometers
        Scanner scan = new Scanner(System.in);
        Double mileInput = scan.nextDouble();
        System.out.println(mileInput + " miles is equal to " + (mileInput * ConversionFactor) + " kilometers");
    }
    
}
