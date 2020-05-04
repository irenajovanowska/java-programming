package ch12.collections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String args[]) {
        //setDemo();
        //listDemo();
        //queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set<String> fruit = new HashSet();
        fruit.add("Apple");
        fruit.add("Lemon");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Lemon");

        System.out.println(fruit.size()); //4
        System.out.println(fruit); // [Apple, Lemon, Orange, Banana]

        // 1.
        var i = fruit.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        // 2.
        for(String item : fruit) {
            System.out.println(item);
        }

        // 3.
        fruit.forEach(x -> System.out.println(x));

        // "syntactic sugar" - the shorter version of 3.
        fruit.forEach(System.out::println);
    }

    public static void listDemo() {
        List fruit = new LinkedList();
        fruit.add("Apple");
        fruit.add("Lemon");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Lemon");

        System.out.println(fruit.get(2)); // Banana
        System.out.println(fruit.size()); // 5
        System.out.println(fruit); // [Apple, Lemon, Banana, Orange, Lemon]

    }

    public static void queueDemo() {
        Queue fruit = new LinkedList();
        fruit.add("Apple");
        fruit.add("Lemon");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Lemon");

        System.out.println(fruit.size()); // 5
        System.out.println(fruit); // [Apple, Lemon, Banana, Orange, Lemon]

        fruit.remove();
        System.out.println(fruit); // [Lemon, Banana, Orange, Lemon]

        System.out.println(fruit.peek()); // Lemon
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("Apple", 95);
        fruitCalories.put("Lemon", 70);
        fruitCalories.put("Banana", 100);
        fruitCalories.put("Orange", 85);
        fruitCalories.put("Lemon", 64);

        System.out.println(fruitCalories.get("Lemon")); // 64
        System.out.println(fruitCalories.size()); // 4
        System.out.println(fruitCalories); // {Apple=95, Lemon=64, Orange=85, Banana=100}

        System.out.println(fruitCalories.entrySet()); // [Apple=95, Lemon=64, Orange=85, Banana=100]

        fruitCalories.remove("Orange");
        System.out.println(fruitCalories); // {Apple=95, Lemon=64, Banana=100}

        for(var entry : fruitCalories.entrySet()) {
            System.out.println(entry.getValue());
        }

        fruitCalories.forEach((k, v) -> System.out.println("Fruit: " + k + " -> Calories: " + v + ";"));
    }
}
