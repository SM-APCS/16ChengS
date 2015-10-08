/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

/**
 *
 * @author spenc_000
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0, value, sum = 0;
        double average;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer (0 to quit): " );
        value = scan.nextInt();
        // Checks if initial value is equal to 0 and ends program
        if (value == 0)
                System.out.println("The program has ended");
        // Runs average program until 0 is entered
        else{
            while(value != 0){
                
                count ++;
                // Counts number of entries
                sum += value; 
                System.out.println("The running sum is: " + sum);
                System.out.println("Enter an integer (0 to quit): " );
                value = scan.nextInt();
                System.out.println("\nNumber of values entered: " + count);
                // Finds average and formats it to three decimals
                average = ((double)sum / count);
                DecimalFormat df = new DecimalFormat ("0.###");
                System.out.println("The average is: " + df.format(average));
            }
        }
        
    }
    
}
