package ch14.testautomation;
/* Create two players
 * ask Player 1 to choose heads or tails
 * ensure that Player 1 guess is valid
 * automatically assign Player 2 guess to the opposite of what Player 1 chose
 * flip the coin
 * determine winner based on what the coin landed on
 * use methods appropriately
 */

import java.util.Scanner;

public class CoinTossGame {
    public static void main(String args[]) {

        System.out.println("Enter first player's name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Enter guess: heads or tails?");
        String guess1  = scanner.next();

        Player player1 = new Player(name);
        Coin coin = new Coin();

        System.out.println("Enter second player's name:");
        String name2 = scanner.next();
        Player player2 = new Player(name2);
        String guess2;

        if (guess1.equals(coin.HEADS) || guess1.equals(coin.HEADS)) {
            if(guess1.equals(coin.HEADS)) {
                guess2 = coin.TAILS;
            } else {
                guess2 = coin.HEADS;
            }
            System.out.println(name + "'s guess is " + guess1 + ", " + name2 + " is " + guess2 + ".\n");

        } else {
            System.out.println("Invalid input! Please enter a valid guess!");
        }

        String result = coin.flip();

        if (result.equals(guess1)) {
            System.out.println("Throwing the coin!");
            try {
                Thread.sleep(2000);
            } catch (java.lang.InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("It landed on " + result + ". The winner is " + name + "!");
        } else {
            System.out.println("Throwing the coin!");
            try {
                Thread.sleep(2000);
            } catch (java.lang.InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("It landed on " + result + ". The winner is " + name2 + "!");
        }
    }
}
