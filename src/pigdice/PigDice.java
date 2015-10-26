/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pigdice;

/**
 *
 * @author spenc_000
 */
    import java.util.Scanner;

public class PigDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int computerTotal=0;
        int computerRoundTotal=0;
        int playerTotal = 0;
        int playerRoundTotal=0;
        Die die1 = new Die();
        Die die2 = new Die();
        String response="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's Play Pig");
        //Plays game until someone wins
        while(computerTotal <100 && playerTotal <100){
            response="y";
            
            while(response.equalsIgnoreCase("y") && playerTotal<100){
                System.out.println("Would you like to roll? (y/n)");
            response = scan.nextLine();
            if(response.equalsIgnoreCase("n")){
                break;
            }
            
            
                //resets the round total before rolling 
                die1.roll();
                die2.roll();
                System.out.println("You rolled:\t" + die1.getFaceValue() + "\t"+die2.getFaceValue());
                //Loses all round points if one roll = 1
                if(die1.getFaceValue()==1 || die2.getFaceValue()==1){
                    playerTotal-=playerRoundTotal;
                    playerRoundTotal =0;
                    System.out.println("Since you rolled a one, you give up the dice to the computer and have lost all points for this round");
                    System.out.println("Your Total: " + playerTotal);
                    break;
                }
                //Loses all points if rolls snake eyes
                else if(die1.getFaceValue()==1 && die2.getFaceValue()==1){
                    System.out.println("You rolled snake eyes. You have zero points and give up the dice.");
                    playerTotal=0;
                    playerRoundTotal=0;
                    break;
                }
                //Otherwise adds to both totals and asks to roll again
                else{
                    playerTotal+= (die1.getFaceValue() + die2.getFaceValue());
                    playerRoundTotal=+(die1.getFaceValue() + die2.getFaceValue());
                    System.out.println("Your Round Total: " + playerRoundTotal);
                    System.out.println("Your Total: " + playerTotal);
                    if(playerTotal>= 100){
                        System.out.println("Congratulations!! \nYou won the game!");
                        return;
                    }
                }
            }
            //Resets computer round total every time before its turn
            System.out.println("The computer is now playing...");
            computerRoundTotal=0;
            
            while(computerRoundTotal<20 && computerTotal<100){
                 
            
                die1.roll();
                die2.roll();
                //has same rules as player
                if(die1.getFaceValue()==1 || die2.getFaceValue()==1){
                    computerTotal-= computerRoundTotal;
                    computerRoundTotal =0;
                    System.out.println("The computer rolled a one and lost its points for the round");
                    System.out.println("The computer has: " + computerTotal + " points");
                    System.out.println("It is now your turn");
                    break;
                }
                
                else if(die1.getFaceValue()==1 && die2.getFaceValue()==1){
                    computerTotal=0;
                    computerRoundTotal=0;
                    System.out.println("The computer has zero points and it is now your turn");
                    break;
                }
                else{
                    computerTotal+=(die1.getFaceValue()+die2.getFaceValue());
                    computerRoundTotal+=(die1.getFaceValue()+die2.getFaceValue());
                    System.out.println("Computer has " + computerTotal + " points");
                      if(computerTotal>=100){
                        System.out.println("The computer won, you lost!");
                        return;
                      }
                }
          
            }
            
        //tells player that computer reached its point limit for the round.
            if(computerRoundTotal>=20){
                System.out.println("The computer reached its limit of points for the round.\n It is your turn to roll.");
            }
           
            
        }
        
    }
    
}
