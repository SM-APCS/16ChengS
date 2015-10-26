/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;

/**
 *
 * @author spenc_000
 */
import java.util.Scanner;
public class PigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sentence, result, another = "y";
        Scanner scan = new Scanner (System.in);
        PigLatinTranslator translator = new PigLatinTranslator();
        while(another.equalsIgnoreCase("y")){
            System.out.println("Enter a sentence (no punctuation):");
            sentence = scan.nextLine();
            
            System.out.println();
            result = translator.translate(sentence);
            System.out.println("That sentence in Pig Latin is: \n" + result);
            
            System.out.print("Translate another sentence (y/n)? ");
            another = scan.nextLine();
        }
    }
    
}
