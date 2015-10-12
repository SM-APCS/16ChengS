/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg8.enumerated;

/**
 *
 * @author spenc_000
 */
public class Enumerated {

    /**
     * @param args the command line arguments
     */
    
    //************************************
    // Shows use of enumerated types
    //************************************
    enum Flavor {vanilla, chocolate, strawberry, fudgeRipple, coffee, rockyRoad, mintChocolateChip, cookieDough}

    public static void main(String[] args) {
        // TODO code application logic here
        Flavor cone1, cone2, cone3;
        
        cone1 = Flavor.chocolate;
        cone2 = Flavor.vanilla;
        
        System.out.println("cone1: " + cone1);
        System.out.println("cone2: " + cone2);
        
        cone3 = cone1;
        
        System.out.println ("cone3: " + cone3);
        
    }
    
}
