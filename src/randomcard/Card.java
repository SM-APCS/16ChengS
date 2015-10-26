/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomcard;
/**
 *
 * Card class that defines what a card is.
 * A card will have 13 possible face values and four different suits.
 */
import java.util.Random;
public class Card {
    //Generates a random value for the numbered cards
    private int faceValue=faceValue = random.nextInt(14) + 1;
    enum Suit{
        Spades, Hearts, Clovers, Diamonds;
        //Creates a random method to randomize the enumerated values
        public static Suit getRandom() {
            return values()[(int) (Math.random() * values().length)];
        }
    }
    private Suit suit = Suit.getRandom();
    private String phrase;
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
