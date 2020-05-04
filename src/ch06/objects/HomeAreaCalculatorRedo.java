package ch06.objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        //We instantiate the class we're in in order to get the things that are non-static within this class
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is " + area + " m2.");

        calculator.scanner.close();
    }
    public Rectangle getRoom() {
        System.out.println("Enter the length of the room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the room:");
        double width = scanner.nextDouble();

        Rectangle room = new Rectangle(length, width);

        return room;

        //return new Rectangle(length, width) - a shortcut in order not to have to store a new variable
    }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
