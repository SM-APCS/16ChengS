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
        int randNum = random.nextInt(100);
        final int BreakNum = 420;
        boolean playGame = true;
        String replay;
        int count = 0;
        System.out.println("Guess the correct number between 1 and 100");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        while (true){
         if( x == BreakNum){

            count++;
            replay = scan.nextLine();
            System.out.println("You lost the game. Want to play again?\t (Y/N)");
            if(replay.equals("Y")){
                randNum = random.nextInt(100);
                System.out.println("Guess the correct number between 1 and 100");
                x = scan.nextInt();
                count = 0;
            }
            else if(replay.equals("N")){
                System.out.println("The game has ended");
                break;
            }
            
         }
          else if(x < randNum){
            System.out.println("Your guess is too low. Try again!\n Type \'420\' to quit");
            x = scan.nextInt();
            count++;
           }
          else if(x > randNum){
            System.out.println("Your guess is too high. Try again!\n Type \'420\' to quit");
            x = scan.nextInt();
            count++;
          }
       
        else if(x == randNum){
            replay = scan.nextLine();
            count++;
            System.out.println("You guessed " + count + " times.");
            System.out.println("You won the game! Want to play again? \t (Y/N)");
            if(replay.equals("Y")){
                randNum = random.nextInt(100);
                System.out.println("Guess the correct number between 1 and 100");
                x = scan.nextInt();
                count = 0;
            }
            else if(replay.equals("N")){
                System.out.println("The game has ended");
                break;
            }
        }
        else{
            System.out.println("Not a valid option");
        }
       
      }
    }    
}
