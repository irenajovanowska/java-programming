package ch04.loops;

//Search a string to determine if it contains the letter 'A'

import java.util.Scanner;

public class LetterSearch {
    public static void main(String args[]) {
        System.out.println("Please type something:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        boolean letterFound = false;

        for(int i = 0; !letterFound && i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                //break;
            }
        }
        if(letterFound) {
            System.out.println("Hooray! The text you entered contains the letter 'A'.");
        } else {
            System.out.println("Sadly, the letter 'A' is nowhere to be found...");
        }
    }
}
