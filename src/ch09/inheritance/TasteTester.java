package ch09.inheritance;

public class TasteTester {
    public static void main(String args[]) {

    BirthdayCake cake1 = new BirthdayCake();
    cake1.setPrice(20);
    System.out.println("My birthday cake tastes like " + cake1.getFlavour() + ", has " + cake1.getCandles() + " candles and costs $" + cake1.getPrice());

    WeddingCake cake2 = new WeddingCake();
    cake2.setTiers(3);
    System.out.println("My wedding cake tastes like " + cake2.getFlavour() + " and has " + cake2.getTiers() + " tiers.");
    }
}
