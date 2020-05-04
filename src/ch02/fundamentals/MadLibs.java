package ch02.fundamentals;

import java.util.Scanner;

public class MadLibs {
    public static void main (String arg[]) {
        System.out.println("Enter season:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Enter number:");
        int number = scanner.nextInt();

        System.out.println("Enter adjective:");
        String adj = scanner.next();
        scanner.close();

        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

    }

}
