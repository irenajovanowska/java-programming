package ch04.loops;

/*
 * User enters two numbers. The pogram sums those numbers
 * User indicates once they're done
 */

import java.util.Scanner;

public class AddNumbers {
    public static void main (String args[]) {
        boolean repeat;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the first number:");
            int first = scanner.nextInt();

            System.out.println("Enter the second number:");
            int second = scanner.nextInt();

            int sum = first + second;

            System.out.println("The sum is " + sum + ".");

            System.out.println("Would you like to go again? Enter 'True' or 'False'.");
            repeat = scanner.nextBoolean();
        } while (repeat);

        scanner.close();
    }
}
