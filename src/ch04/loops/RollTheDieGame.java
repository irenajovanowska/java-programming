package ch04.loops;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String args[]) {
        Random random = new Random();

        int maxRolls = 5;
        int maxPosition = 20;
        int position = 0;
        int spacesLeft;

        for(int i = 1; i <= maxRolls; i++) {
            int die = random.nextInt(6) + 1;
            position+=die;
            spacesLeft = maxPosition - position;

            if(spacesLeft == 0) {
                System.out.println("Roll # " + (i) + ": You've rolled a " + die +". Congrats! You have won!");
                break;
            } else if(position > maxPosition) {
                System.out.println("Roll # " + (i) + ": You've rolled a " + die + ". Unfortunately, that takes you past position " + maxPosition + ". You have lost...");
                break;
            } else if(i == maxRolls && position < maxPosition) {
                System.out.println("Roll # " + (i) + ": You've rolled a " + die + ". Unfortunately, you didn't make it to position " + maxPosition + ". You have lost...");
            } else {
                System.out.println("Roll # " + (i) + ": You've rolled a " + die + " and are on position " + position + ". You have " + spacesLeft + " more to go.");
            }
        }
    }
}
