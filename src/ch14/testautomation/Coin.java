package ch14.testautomation;
/* Include following:
 * a field called side
 * encapsulation
 * constant variables for heads and tails
 * a method called flip() which randomly chooses heads or tails and assigns the value to side
 */

import java.util.Random;

public class Coin {

    private static boolean side = true;
    protected static final String HEADS = "heads";
    protected static final String TAILS = "tails";

    public static String flip() {
        Random finalSide = new Random();
        side = finalSide.nextBoolean();
        String result;

        if(side) {
            result = HEADS;
        } else {
            result = TAILS;
        }

        return result;
    }
}
