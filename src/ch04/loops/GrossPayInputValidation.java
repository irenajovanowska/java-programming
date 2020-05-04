package ch04.loops;

/*
Employees make $15/h
Allow the manager to enter weekly hours for each employee and calculate their pay
Do not allow overtime
 */

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main (String args[]) {
        int rate = 15;
        int maxhours = 40;
        int minhours = 1;
        int count = 1;

        //Ask for number of employees
        System.out.println("Enter number of employees:");
        Scanner scanner = new Scanner(System.in);
        int employeesNum = scanner.nextInt();

        while(count <= employeesNum) {
            System.out.println("Enter number of weekly hours for employee no. " + count);
            double hours = scanner.nextDouble();

            while(hours > maxhours || hours < minhours) {
                System.out.println("Invalid entry! Hours should be between 1 and 40. Try again!");
                hours = scanner.nextDouble();
            }
            double pay = rate*hours;

            System.out.println("Employee no. " + count + " made a total of $" + pay + " this week.");

            count+=count;
        }

    }

}
