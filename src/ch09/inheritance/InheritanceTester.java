package ch09.inheritance;

public class InheritanceTester {
    public static void main(String args[]) {

        //Person person = new Person();
        //Employee employee = new Employee();
        //employee.setName("irena");
        //String name = employee.getName();
        //System.out.println(name);

        //testSquareOverride();

        //Rectangle rectangle = new Rectangle();
        //rectangle.print();

        //Square square = new Square();
        //square.print("square");

        Mother mother = new Mother();
        mother.setName("Irena");
        System.out.println(mother.getName() + " is a " + mother.getGender());
    }

    public static void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(3);
        System.out.println("The perimeter of the rectangle is " + rectangle.calculatePerimetar() + " cm.");

        Square square = new Square();
        square.setLength(5);
        square.setWidth(3);
        System.out.println("The perimeter of the square is " + square.calculatePerimetar() + " cm.");
    }
}
