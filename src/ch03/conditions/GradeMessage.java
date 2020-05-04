package ch03.conditions;

/*
When a user enters their grade
print a message telling them how they did
 */

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){
        //1.Stating the unknown
        System.out.println("Please enter your grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "Work harder!";
                break;
            case "F":
                message = "Uh ho!";
            default:
                message = "Invalid grade!";
                break;
        }
        System.out.println(message);

    }
}
