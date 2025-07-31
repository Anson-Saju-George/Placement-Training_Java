// _020_Lists.java
// Demonstrates usage of List, LinkedList, and common operations

import java.util.*;

public class _020_Lists {
    public static void main(String[] args) {

        System.out.println("=== Working with Lists ===");

        // List interface with ArrayList implementation
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Display the list
        System.out.println("Fruits List: " + fruits);

        // Access elements
        System.out.println("First fruit: " + fruits.get(0));

        // Modify element
        fruits.set(1, "Grapes");
        System.out.println("After modification: " + fruits);

        // Remove element
        fruits.remove("Mango");
        System.out.println("After removal: " + fruits);

        // Size of list
        System.out.println("Size of list: " + fruits.size());

        // Iterating using loop
        System.out.println("Iterating using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if list contains an item
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));

        // Sort the list
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);

        // Using LinkedList
        LinkedList<String> linkedFruits = new LinkedList<>(fruits);
        linkedFruits.addFirst("Pineapple");
        linkedFruits.addLast("Strawberry");

        System.out.println("LinkedList version: " + linkedFruits);

        // Remove from front and back
        linkedFruits.removeFirst();
        linkedFruits.removeLast();

        System.out.println("LinkedList after removal: " + linkedFruits);
    }
}
