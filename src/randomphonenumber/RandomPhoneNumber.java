/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomphonenumber;

/**
 *
 * @author spenc_000
 */   
import java.util.Random;

public class RandomPhoneNumber {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int firstnum, secondnum, thirdnum, fourthnum, fifthnum, sixthnum, seventhnum, eightnum, ninthnum, tenthnum;
        String areacode;
        String middlenumber;
        String lastfour;
        firstnum = random.nextInt(8);
        secondnum = random.nextInt(8);
        thirdnum = random.nextInt(8);
        areacode = "(" + firstnum + secondnum + thirdnum + ")";
        fourthnum = random.nextInt(8);
        if (fourthnum == 7){
            fifthnum = random.nextInt(4);
        }
        else{
            fifthnum = random.nextInt(10);
        }
        if (fourthnum == 7 && fifthnum == 4){
            sixthnum = random.nextInt(3);
        }
        else{
            sixthnum = random.nextInt(10);
        }
        
        seventhnum = random.nextInt(10);
        eightnum = random.nextInt(10);
        ninthnum = random.nextInt(10);
        tenthnum = random.nextInt(10);
        
        middlenumber = "-" + fourthnum + fifthnum + sixthnum;
        lastfour = "-" + seventhnum + eightnum + ninthnum + tenthnum;
        System.out.println(areacode + middlenumber + lastfour);
    }
    
}
