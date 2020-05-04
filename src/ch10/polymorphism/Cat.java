package ch10.polymorphism;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void scratch() {
        System.out.println("Me likes to scratch!");
    }
}
