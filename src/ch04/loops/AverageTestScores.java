package ch04.loops;

/* Find the average test score of each student
 * There are 24 students and 4 tests
 */

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String args[]) {
        int studentNo = 24;
        int testNo = 4;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < studentNo; i++) {
            double total = 0;

            for(int j = 0; j < testNo; j++) {
                System.out.println("Enter score for Test #" + (j+1) + " for Student #" + (i+1) + ".");
                double score = scanner.nextDouble();
                total+=score;
            }
            double avg = total/testNo;
            System.out.println("Test average for Student #" +(i+1) + " is " + avg + ".");
        }
        scanner.close();
    }
}
