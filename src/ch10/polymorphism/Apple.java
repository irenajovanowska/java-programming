package ch10.polymorphism;

public class Apple extends Fruit {

    public Apple() {
        calories = 90;
    }

    public void removeSeeds() {
        System.out.println("Remove the seeds from the apple.");
    }

    @Override
    public void makeJuice() {
        System.out.println("Making an apple juice.");
    }
}
