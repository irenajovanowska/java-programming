package ch03.conditions;

/*
To qualify for a loan a person must make at least $30000
and be working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main (String args[]) {
        //1.Initialize known variables salary and years
        int salaryQuota = 30000;
        int yearsQuota = 2;

        //2.Find out the unknowns
        System.out.println("Enter your net salary per year:");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();

        System.out.println("Enter years at current job:");
        double years = scanner.nextDouble();
        scanner.close();

        //3.Check if the person is eligible for a loan
        if(salary >= salaryQuota) {
            if(years >= yearsQuota) {
                System.out.println("Congrats! You qualify for the loan!");
            } else {
                System.out.println("Sorry! You must have at least " +yearsQuota + " years at your current job!");
            }
        } else {
            System.out.println("Sorry! You must earn at least " + salaryQuota + " to qualify for the loan.");
        }
    }
}
