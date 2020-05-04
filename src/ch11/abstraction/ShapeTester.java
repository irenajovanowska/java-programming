package ch11.abstraction;

public class ShapeTester {
    public static void main(String args[]) {

        //An abstract class can not be instantiated and used as-is, but it serves only as a template
        //Shape shape = new Shape();

        Shape shape = new Rectangle(5, 3);
        shape.print();
        System.out.println(shape.calculateArea());
    }
}
