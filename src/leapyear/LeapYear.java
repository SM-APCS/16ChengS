/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

/**
 *
 * @author spenc_000
 */
import java.util.Scanner;
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        year = scan.nextInt();
        //Checks if year is less than 1582
        if(year < 1582){
            System.out.println("Please do not enter a year below 1582");           
        }
        else{
            //Determines if year is divisible by 4 evenly
            if(year%4 == 0){
                if(year%100 == 0 && year%400 != 0){
                System.out.println("The year: " + year + " is not a leap year");
                }
                else{
                System.out.println("The year: " + year + " is a leap year");
                }
            }
            //If not divisible by four then not a leap year
            else{
                System.out.println("The year: " + year + " is a leap year");
            }
            
        }
    }
    
}
