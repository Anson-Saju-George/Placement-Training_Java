// _012_FunctionOverloading.java
// Demonstrates function (method) overloading in Java

public class _012_FunctionOverloading {

    // Method with 1 int parameter
    public static void greet(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello!");
        }
    }

    // Method with 1 string parameter
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with 2 parameters
    public static void greet(String name, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello, " + name + "!");
        }
    }

    // Method with different parameter order
    public static void greet(int times, String name) {
        System.out.println("Greeting " + times + " times:");
        for (int i = 1; i <= times; i++) {
            System.out.println(i + ". Hey " + name);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Function Overloading Example ===");

        greet(2);                   // calls method with int
        greet("Alice");            // calls method with String
        greet("Bob", 3);           // calls method with String and int
        greet(2, "Charlie");       // calls method with int and String
    }
}
