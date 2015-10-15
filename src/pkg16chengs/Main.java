/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16chengs;

/**
 *
 * @author spenc_000
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
        final int BASE  = 32;
        final double CONVERSION_FACTOR = (9.0/5.0);
        
        int celsiusTemp = 36;
        double fahrenheightTemp;
        
        fahrenheightTemp = (BASE + celsiusTemp*CONVERSION_FACTOR);
        System.out.println("36 degrees celsius is: " + fahrenheightTemp + " degrees Fahrenheight");
        
        
        int fahrenheightRounded = (int) fahrenheightTemp;
        System.out.println("Fahrenheight Tempurature rounded: " + fahrenheightRounded);
        System.out.println("Original Fahrenheight Temp is : " + fahrenheightTemp);
    }
    
}
