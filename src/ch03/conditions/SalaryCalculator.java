package ch03.conditions;
/*
All salespeople get $1000 per week.
Those who exceed 10 sales - get $250 bonus.
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main (String args[]) {
        //1.Initialize weekPay and bonus
        int weekPay = 1000;
        int bonus = 250;
        int quota = 10;

        //2.Count the number of sales each salesman makes
        System.out.println("Enter number of sales:");
        Scanner scanner = new Scanner(System.in);
        int salesNum = scanner.nextInt();
        scanner.close();

        //3.If count > 10 then pay = 1000+250
        if (salesNum > quota) {
            weekPay+=bonus;
        }
        //4.Output
        System.out.println("For " + salesNum + " sales you get $" + weekPay + ".");


    }

}
