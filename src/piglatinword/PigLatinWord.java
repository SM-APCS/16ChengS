/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatinword;

/**
 *
 * @author spenc_000
 */
import java.util.Scanner;
public class PigLatinWord {
    public static void main(String[] args) {

        String word, result, another = "y";
        Scanner scan = new Scanner (System.in);
        PigLatinWordTranslator translator = new PigLatinWordTranslator();

       while(another.equalsIgnoreCase("y")){
          System.out.println("Enter a word(no punctuation)");
          word = scan.nextLine();
          
          result = translator.translate(word);
          System.out.println("\nThat sentence in Pig Latin is: \n" + result);
          System.out.print("Translate another sentence (y/n)? ");
          another = scan.nextLine();
       }
    }
   
}
