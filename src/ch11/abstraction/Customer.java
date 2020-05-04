package ch11.abstraction;

public class Customer {
    public static void main(String args[]) {

        Product book = new Book();
        book.setName("Mindset");
        System.out.println(book.getName());

    }
}
