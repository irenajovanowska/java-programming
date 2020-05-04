package ch06.objects;

/* Write a class that creates instances of Rectangle class
 * to find the total area of two rooms in a house
 */

public class HomeAreaCalculator {
    public static void main(String args[]) {
        //Instance of Rectangle class i.e creating an object
        Rectangle room1 = new Rectangle();
        room1.setWidth(10);
        room1.setLength(10);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(10, 15);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("The total area is " + totalArea + " m2.");
    }
}
