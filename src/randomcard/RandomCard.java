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

public class RandomCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0;i<20;i++){
            Card card = new Card();
            System.out.println(card);
        }
    }
    
}
