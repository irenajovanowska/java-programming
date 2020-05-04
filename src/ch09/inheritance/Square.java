package ch09.inheritance;

public class Square extends Rectangle {

    @Override
    public double calculatePerimetar() {
        return sides * length;
    }

    public void print(String what) {
        System.out.println("This is a " + what + ".");
    }
}
