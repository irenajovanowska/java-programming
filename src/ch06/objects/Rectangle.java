package ch06.objects;

public class Rectangle {
    //Fields / variables / characteristics
    //Encapsulation
    private double length;
    private double width;

    //Default constructor
    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length; //can be set this way
        setWidth(width); //or this way
    }

    //getter and setter methods for each field
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //Methods / actions
    public double calculatePerimeter(){
        return (2 * length) + (2*width);
    }

    public double calculateArea() {
        return length*width;
    }
}
