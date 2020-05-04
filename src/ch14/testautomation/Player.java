package ch14.testautomation;
/* Include following:
 * fields called name and guess
 * encapsulation
 * a constructor that accepts name
 */

public class Player {

    private static String name;
    private static String guess;

    public Player() {
    }

    public Player(String name) {
        setName(name);
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Player.name = name;
    }

    public static String getGuess() {
        return guess;
    }

    public static void setGuess(String guess) {
        Player.guess = guess;
    }
}
