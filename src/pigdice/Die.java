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
import java.util.Random;
public class Die {
    private final int MIN_FACES = 4;
    private static Random generator = new Random();
    private int numFaces;
    private int faceValue;
    
    //----------------------------------
    //Defaults to a six-sided die. Initial face value is 1.
    //-----------------------------------
    public Die(){
        numFaces = 6;
        faceValue =1;
    }
    public Die(int faces){
        if (faces < MIN_FACES){
            numFaces = 6;
        }
        else{
            numFaces = faces;
        }
        faceValue =1;
    }
    public int roll(){
        faceValue = generator.nextInt(numFaces) + 1;
        return faceValue;
    }
    //Returns the curren tdie value.
    
    public int getFaceValue(){
        return faceValue;
    }
}
