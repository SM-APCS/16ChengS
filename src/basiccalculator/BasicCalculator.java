/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccalculator;

/**
 *
 * @author spenc_000
 */
import java.util.Scanner;

public class BasicCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double number1, number2, number3;
        //Finds sum of all three numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert three number");
        number1 = scan.nextDouble();
        number2 = scan.nextDouble();
        number3 = scan.nextDouble();
        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + (number1 + number2 + number3));
        //Finds average of all three numbers
        System.out.println("The average of " + number1 + ", " + number2 + ", " + number3 + " is: " + ((number1 + number2 + number3)/3));
        //Finds the product of all three numbers
        System.out.println("The prodcut of " + number1 + ", " + number2 + ", " + number3 + " is: " + (number1*number2*number3));
    }
    
}
