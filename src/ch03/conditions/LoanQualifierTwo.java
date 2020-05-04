package ch03.conditions;

import java.util.Scanner;

public class LoanQualifierTwo {
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
        if((salary >= salaryQuota) && (years >= yearsQuota)) {
            System.out.println("You are eligible for a loan!");
        } else {
            System.out.println("You are not eligible for a loan.");
        }
    }
}
