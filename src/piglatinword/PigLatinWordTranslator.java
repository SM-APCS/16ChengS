/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatinword;

import java.util.Scanner;

/**
 *
 * @author spenc_000
 */
public class PigLatinWordTranslator {
    public String translate (String word){
        String result = "";
        Scanner scan = new Scanner(word);
        
        while (scan.hasNext()){
            result += translateWord (scan.next());
            result += " ";
        }
        return result;
    }
   private String translateWord (String word){
       String result = "";
       result = word.substring(2).concat(word.substring(0,2)).concat("ay");
       return result;
   }
}
