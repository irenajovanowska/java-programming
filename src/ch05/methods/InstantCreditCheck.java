package ch05.methods;

/* Write an instant credit check program
 * that approves anyone hat makes more than $25k
 * and has a credit score of 700 or better.
 * Reject all others
 */

import java.util.Scanner;

public class InstantCreditCheck {

    static int minSalary = 25000;
    static int minScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        //Get unknown
        double salary = getSalary();
        int score = getScore();

        scanner.close();

        //Check the condition
        boolean isQualified = isUserQualified(salary, score);

        //Output
        notifyUser(isQualified);
    }
    public static double getSalary() {
        System.out.println("Enter salary:");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getScore() {
        System.out.println("Enter credit score:");
        int score = scanner.nextInt();
        return score;
    }
    public static boolean isUserQualified(double salary, int score) {
        if(salary >= minSalary && score >= minScore)
            return true;
        else
            return false;
    }
    public static void notifyUser(boolean isQualified) {
        if(isQualified)
            System.out.println("Congrats! You are approved!");
        else
            System.out.println("Unfortunately, you are declined.");
    }
}
