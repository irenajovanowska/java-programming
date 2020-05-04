package ch10.polymorphism;

public class Market {
    public static void main(String args[]) {

        Fruit apple = new Apple();
        apple.makeJuice();

        Apple fruit = new Apple();
        System.out.println(fruit.calories);


        apple = new Banana();
        apple.makeJuice();
        ((Banana) apple).peel();
        System.out.println(apple.calories);

    }
}
