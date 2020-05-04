package ch07.arrays;
/* Allow a user to enter any number of grades
 * and then provide them with their average score,
 * as well as their highest and lowest grade
 */

import java.util.Scanner;

public class GradesNdf {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] grades;

    public static void main(String args[]) {

        //Get number of grades
        System.out.println("Enter the number of grades:");
        grades = new int[scanner.nextInt()];

        getGrades();

        scanner.close();

        //Display results
        System.out.println("Your average score is " + String.format("%.2f", calculateAverageScore()));
        System.out.println("Your highest grade is " + getHighestGrade());
        System.out.println("Your lowest grade is " + getLowestGrade());
    }

    /* Another way of writing the getGrades() method, where it doesn't take any input parameters
     * and it doesn't return a value
     * it uses the global variable int[] grades
     */

    public static void getGrades() {
        for(int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade #" + (i+1) + ":");
            grades[i] = scanner.nextInt();
        }
    }

    public static double calculateAverageScore() {
        double sum = 0;
        for(int value : grades) {
            sum+=value;
        }
        return sum/grades.length;
    }

    public static int getHighestGrade() {
        int highest = grades[0];
        for(int value : grades) {
            if(value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    public static int getLowestGrade() {
        int lowest = grades[0];
        for(int value : grades) {
            if(value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }
}
