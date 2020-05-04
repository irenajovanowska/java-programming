package ch02.fundamentals;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String arg[]) {
        System.out.println("Enter hours:");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Enter rate:");
        double rate = scanner.nextDouble();
        scanner.close();

        double gross = hours * rate;
        System.out.println("Gross amount is: $" + gross);
    }

}
