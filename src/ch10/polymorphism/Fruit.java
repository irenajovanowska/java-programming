package ch10.polymorphism;

public class Fruit {

    protected int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void makeJuice() {
        System.out.println("The juice is made.");
    }

}
