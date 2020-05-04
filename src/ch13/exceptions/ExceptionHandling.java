package ch13.exceptions;

/* A method that creates a new file
 * and handles exceptions that may occur
 *
 * A method that reads decimal numbers from a file
 * and handles exceptions FileNotFoundException and InputMismatchException
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String args[]) {

        //createNewFile();
        readFile();
        //readFileOptional();
        //createNewFileRethrow();
    }

    public static void createNewFile() {
        File file = new File("C:/Users/Remote/Desktop/projects/java course/java_created_file.txt");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println("Directory does not exist!");
            ex.printStackTrace();
            ex.getMessage();
        }
    }

    public static void createNewFileRethrow() throws IOException {
        File file = new File("C:/Users/Remote/Desktop/projects/java course/java_created_file.txt");
        file.createNewFile();
    }

    // Option 1. using the "finally" block to close the scanner
    public static void readFile() {
        File file = new File("C:/Users/Remote/Desktop/projects/java course/java_created_file.txt");
        Scanner fileReader = null;

        try {
            fileReader = new Scanner(file);

            while(fileReader.hasNext()) {
                double number = fileReader.nextDouble();
                System.out.println(number);
            }
        } catch (FileNotFoundException | InputMismatchException ex) {
            ex.printStackTrace();
        } finally {
            fileReader.close();
        }
    }

    // Option 2. using "try" with resources to close the scanner instead of using a "finally" block
    public static void readFileOptional() {
        File file = new File("C:/Users/Remote/Desktop/projects/java course/java_created_file.txt");
        try (Scanner fileReader = new Scanner(file)) {
            while(fileReader.hasNext()) {
                double number = fileReader.nextDouble();
                System.out.println(number);
            }
        } catch (FileNotFoundException | InputMismatchException ex) {
            ex.printStackTrace();
        }
    }
}
