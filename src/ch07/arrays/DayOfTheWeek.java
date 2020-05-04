package ch07.arrays;

import java.util.Scanner;

/* Make an array that holds the textual values of the days of the week
 * Assume the week starts on Monday
 * Have a user input a number corresponding to the day of the week
 * Output the corresponding string
 */
public class DayOfTheWeek {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Please enter a number that corresponds to a day of the week:");
        int numberDay = scanner.nextInt();
        scanner.close();

        if (numberDay >= 1 && numberDay <= 7) {
            System.out.println("The corresponding day of " + numberDay +" is " + week[numberDay - 1] + ".");
        } else {
            System.out.println("Oops! A week has only seven days, so try entering a number between 1 and 7.");
        }
    }
}
