package ch03.conditions;

/*
Display a letter grade for a student
based on their test score.
 */

import java.util.Scanner;

public class TestResults {
    public static void main (String args[]) {
        //Initialize score limits
        int limit1 = 60;
        int limit2 = 70;
        int limit3 = 80;
        int limit4 = 90;
        int limit5 = 100;

        //1.Get the test score
        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        //2.Determine the letter grade
        if(score < limit1){
            System.out.println("Sorry, you failed the test.");
        } else if((limit1 <= score) && (score <= limit2)){
            System.out.println("You got a D");
        } else if((limit2 <= score) && (score <= limit3)){
            System.out.println("You got a C");
        } else if((limit3 <= score) && (score <= limit4)){
            System.out.println("You got a B");
        } else if((limit4 <= score) && (score <= limit5)){
            System.out.println("Congrats! You got an A");
        }

    }
}
