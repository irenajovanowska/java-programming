package ch11.abstraction;

public class Farm {
    public static void main(String args[]) {

        Animal animal = new Duck();
        animal.eat();
        animal.makeSound();

        animal = new Pig();
        animal.makeSound();
    }
}
