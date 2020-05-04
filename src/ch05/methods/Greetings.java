package ch05.methods;

/* A method that asks a user for their name
 * and then greets them by name
 */

import java.util.Scanner;

public class Greetings {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.next();
        scanner.close();
        greetUser(name);
    }
    public static void greetUser(String s) {
        System.out.println("Hi there, " + s + "!");
    }
}
