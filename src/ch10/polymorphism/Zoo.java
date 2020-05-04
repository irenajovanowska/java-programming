package ch10.polymorphism;

public class Zoo {
    public static void main(String args[]) {

        //Dog dog = new Dog();
        //dog.fetch();
        //dog.makeSound();

        Animal dog2 = new Dog();
        dog2.makeSound();
        feed(dog2);

        dog2 = new Cat();
        dog2.makeSound();
        //Casting
        ((Cat) dog2).scratch();
        feed(dog2);
    }

    public static void feed(Animal animal) {

        if(animal instanceof Dog) {
            System.out.println("Here's your dog food.");
        } else if(animal instanceof Cat)
            System.out.println("Here's your cat food.");

    }
}
