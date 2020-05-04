package ch13.exceptions;

public class DividingByZero {
    public static void main(String args[]) {

     try {
         int c = 30/0;
     } catch (ArithmeticException ex) {
         System.out.println("Dividing by zero is not permitted.");
     } finally {
         System.out.println("Division is fun!");
     }
    }
}
