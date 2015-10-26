/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countflips;

/**
 *
 * @author spenc_000
 */
public class CountFlips {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NUM_FLIPS = 1000;
        int heads = 0, tails = 0;
        
        Coin myCoin = new Coin(); //instantiates the Coin object
        //Repeats flipping the coin 1000 times
        for(int count =1; count<=NUM_FLIPS; count++){
            
            myCoin.flip();
            if(myCoin.isHeads()) heads++;
            else tails++;
        }
        System.out.println("The number of flips: " + NUM_FLIPS);
        System.out.println("The number of heads: " + heads);
        System.out.println("The number of tails: " + tails);
    }
    
}

