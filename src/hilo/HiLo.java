/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

/**
 *
 * @author spenc_000
 */
import java.util.Scanner;
import java.util.Random;
public class HiLo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        final int BreakNum = 0;
        String replay;
        replay = "Y";
        Scanner scan = new Scanner(System.in);
        int x;
        int count;
        do{
                   count = 0;

        int randNum = random.nextInt(100);
        System.out.println("Guess the correct number between 1 and 100; \'0\' to quit");
                   x = scan.nextInt();
        // Starts the game and asks for a random number
        do{    
          if(x>0){
            if(x==randNum){
                //Checks if the guess is = to the answer and counts the guesses
                count++;
                System.out.println("You guessed " + count + " times");
                System.out.println("You won the game!");
                

            }

            else if(x < randNum){
                //Checks if guess is below the generated number
              System.out.println("Your guess is too low. Try again!\n Type \'0\' to quit");
              x = scan.nextInt();
              count++;
             }
            else {
                //Checks if guess is above the generated number
              System.out.println("Your guess is too high. Try again!\n Type \'0\' to quit");
              x = scan.nextInt();
              count++;
            }
          }
        }
        while(x!= BreakNum && x!= randNum);
        //Opens prompt to play game again after winning or losing
        if(x==randNum){
            System.out.println("You guessed " + count + " times");
            System.out.println("Play again? (Y/N)");
            replay = scan.next();
        }
        else if(x==BreakNum){
            System.out.println("You lost");
            System.out.println("Play again? (Y/N)");
            replay = scan.next();

        }
        
        }
        //Replays game if answer to prompt is Yes
        while(replay.equalsIgnoreCase("Y"));
    
    }    
}
