package ch07.arrays;
/* Allow a user to enter any number of grades
 * and then provide them with their average score,
 * as well as their highest and lowest grade
 */

import java.util.Scanner;

public class Grades {

    private static Scanner scanner = new Scanner(System.in);
    //private static int[] grades;

    public static void main(String args[]) {

        //Get number of grades
        System.out.println("Enter the number of grades:");
        int numberOfGrades = scanner.nextInt();
        //Other way of
        //grades = new int[scanner.nextInt()];

        //Calculate average score
        //Find the highest grade
        //Find the lowest grade
        int[] grades = getGrades(numberOfGrades);

        //Display results
        System.out.println("Your average score is " + String.format("%.2f", calculateAverageScore(grades)));
        System.out.println("Your highest grade is " + getHighestGrade(grades));
        System.out.println("Your lowest grade is " + getLowestGrade(grades));
    }

    /* Another way of writing the getGrades() method, where it doesn't take any input parameters
     * and it doesn't return a value
     * it uses the global variable int[] grades
     */

    //public static void getGrades() {
    //    for(int i = 0; i < grades.length; i++) {
    //        System.out.println("Enter grade #" + (i+1) + ":");
    //        grades[i] = scanner.nextInt();
    //    }
    //}

    public static int[] getGrades(int totalGrades) {
        int[] grades = new int[totalGrades];
        for(int i = 0; i < totalGrades; i++) {
            System.out.println("Enter grade #" + (i+1) + ":");
            grades[i] = scanner.nextInt();
        }
        return grades;
    }

    public static double calculateAverageScore(int[] array) {
        double sum = 0;
        for(int value : array) {
            sum+=value;
        }
        double averageScore = sum/array.length;
        return averageScore;
    }

    public static int getHighestGrade(int[] array) {
        int highest = array[0];
        for(int value : array) {
            if(value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    public static int getLowestGrade(int[] array) {
        int lowest = array[0];
        for(int value : array) {
            if(value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }
}
