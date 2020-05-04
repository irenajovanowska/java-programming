package ch03.conditions;

/*
Salespeople are expected to make at least 10 sales/week.
Those who do - receive a congratulation message.
Those who don't are informed of how many sales they were short.
 */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main (String args[]){
        //1.Initialization quota
        int quota = 10;

        System.out.println("Enter number of sales for this week:");
        Scanner scanner = new Scanner(System.in);
        int salesNum = scanner.nextInt();
        scanner.close();

        //2.If salesNum = quota - congratulations, else quota - salesNum
        if(salesNum >= quota){
            System.out.println("Congrats! You've made " + salesNum + " sales this week.");
        }
        else{
            int shortage = quota - salesNum;
            System.out.println("Unfortunately, you're missing a total of " + shortage + " sales to meet weekly quota.");
        }

    }
}
