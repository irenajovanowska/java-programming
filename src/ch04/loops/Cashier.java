package ch04.loops;

/* A cashier program that scans a given number of items
 * and tallies the cost.
 */

import java.util.Scanner;

public class Cashier {
    public static void main(String args[]) {
        System.out.println("Enter number of items to scan:");
        Scanner scanner = new Scanner(System.in);
        int itemsNo = scanner.nextInt();

        double sum = 0;

        for(int count = 1; count <= itemsNo; count++) {
            System.out.println("Enter price for item no. " + count + ":");
            double price = scanner.nextDouble();

            sum+=price;
        }
        scanner.close();

        System.out.println("These " + itemsNo + " items cost a total of $" + sum + ".");
    }
}
