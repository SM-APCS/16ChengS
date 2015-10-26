/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreprint;

/**
 *
 * @author spenc_000
 */
import java.util.Scanner;

public class StringReprint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String phrase;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a phrase!");
        //Scans next string and stores it in variable phrase
        phrase = scan.nextLine();
        //Prints out each individual character on a new line until all characters have been printed
        for(int i = 0; i< phrase.length(); i++ ){
           System.out.println(phrase.charAt(i));
           
        }
    }
    
}
