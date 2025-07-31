// _021_ArrayList.java
// Demonstrates ArrayList with different datatypes and common operations

import java.util.ArrayList;

public class _021_ArrayList {
    public static void main(String[] args) {

        System.out.println("=== ArrayList Examples ===");

        // ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(15);

        System.out.println("Integer List: " + numbers);
        numbers.remove(Integer.valueOf(5)); // remove element by value
        System.out.println("After removing 5: " + numbers);
        System.out.println("Contains 15? " + numbers.contains(15));
        System.out.println("Size: " + numbers.size());

        // Sorting
        numbers.sort(null);  // Natural order
        System.out.println("Sorted: " + numbers);

        // ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("\nString List: " + names);

        // Looping
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // ArrayList of Doubles
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(99.99);
        prices.add(49.50);
        prices.add(25.25);

        System.out.println("\nDouble List: " + prices);
        double total = 0;
        for (Double price : prices) {
            total += price;
        }
        System.out.printf("Total price: %.2f\n", total);

        // Access and update
        prices.set(1, 55.55); // update value
        System.out.println("Updated Double List: " + prices);
    }
}
