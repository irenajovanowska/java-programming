package ch11.abstraction;

public abstract class Animal {

    public abstract void makeSound();

    public void eat() {
        System.out.println("I am an animal and I like to eat.");
    }
}
