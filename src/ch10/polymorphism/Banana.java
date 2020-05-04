package ch10.polymorphism;

public class Banana extends Fruit {

    public Banana() {
        calories = 100;
    }

    public void peel() {
        System.out.println("The banana has to be peeled.");
    }

    public void makeJuice() {
        System.out.println("Making banana juice.");
    }
}
