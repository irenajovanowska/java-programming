package ch11.abstraction;

public abstract class Shape {

    abstract double calculateArea();

    public void print() {
        System.out.println("This is a shape.");
    }
}
