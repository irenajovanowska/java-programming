package ch03.conditions;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main (String args[]) {
        int dollar = 1;
        double quartercent = .25;
        double dimecent = .1;
        double nickelcent = .05;
        double pennycent = .01;

        System.out.println("This is a 'Change For A Dollar' game: Enter enough change to make exactly $1, and you win!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of quarters:");
        int quarters = scanner.nextInt();

        System.out.println("Enter number of dimes:");
        int dimes = scanner.nextInt();

        System.out.println("Enter number of nickels:");
        int nickels = scanner.nextInt();

        System.out.println("Enter number of pennies:");
        int pennies = scanner.nextInt();

        scanner.close();

        double sum = quarters*quartercent + dimes*dimecent + nickels*nickelcent + pennies*pennycent;
        double change;

        if (sum > dollar) {
            change = sum - dollar;
            System.out.println("Uh ho!. You went over for " + String.format("%.2f", change) + " cents. Please try again.");
        } else if (sum < dollar) {
            change = dollar - sum;
            System.out.println("Uh ho!. You were under for " + String.format("%.2f", change) + " cents. Please try again.");
        } else {
            System.out.println("Congrats! You won!");
        }
    }
}
