/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomcard;
/**
 *
 * @author spenc_000
 */
import java.util.Random;
public class Card {
    private int faceValue=faceValue = random.nextInt(14) + 1;
    enum Suit{
        Spades, Hearts, Clovers, Diamonds;
        public static Suit getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }
    }
    Suit suit = Suit.getRandom();
    String phrase;
    private static Random random = new Random();
    
    
    //Returns a string of the card combination
    public String toString(){
        if(faceValue<=10){
            phrase = (faceValue + " of " + suit);
        }
        else if(faceValue ==11){
            phrase = ("Jack of " + suit);
                   
        }
        else if(faceValue==12){
            phrase = ("Queen of " + suit);
        }
        else if(faceValue ==13){
            phrase = ("King of " + suit);
        }
        else if(faceValue ==14){
            phrase = ("Ace of " + suit);
        }
        return phrase;
    }
    
   
}
