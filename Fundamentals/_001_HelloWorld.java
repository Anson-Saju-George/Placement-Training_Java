// 01_HelloWorld.java
// Demonstrates various ways to print "Hello World" in Java

public class _001_HelloWorld {

    // A method that prints a message
    public static void printMessage() {
        System.out.println("Hello World from method");
    }

    public static void main(String[] args) {

        // Basic output
        System.out.println("HelloWorld!"); // Simple println
        System.out.println(); // Blank line

        System.out.println("Various other methods include...");
        System.out.println(); // Blank line

        // Using println (adds a newline after printing)
        System.out.println("Printing with newline:");
        System.out.println("Hello World!"); // Prints on a new line

        // Using print (no newline)
        System.out.println("Printing without newline:");
        System.out.print("Hello");
        System.out.print(" World"); // Continues on the same line
        System.out.println(); // Move to next line

        // Using printf (formatted output)
        System.out.println("Formatted printing like C’s printf:");
        String name = "World";
        System.out.printf("Hello %s\n", name); // %s is placeholder for string

        // Using String.format() and then printing
        System.out.println("Using String.format() and print:");
        String msg = String.format("Hello %s", "World");
        System.out.print(msg);
        System.out.println(); // newline

        // Another example using String.format()
        String msg1 = String.format("Hello %s", "World");
        System.out.print(msg1);
        System.out.println(); // newline

        // Special characters and escape sequences
        System.out.println("Using escape sequences:");
        System.out.println("Hello\tWorld");    // Tab space
        System.out.println("Hello\nWorld");    // New line
        System.out.println("Hello \"World\""); // Double quotes

        // Calling a method that prints a message
        printMessage();

        // String concatenation examples
        System.out.println("Concatenating strings directly:");
        System.out.println("Hello " + "World");

        System.out.println("Concatenating string variables:");
        String greeting = "Hello";
        String target = "World";
        System.out.println(greeting + " " + target);
    }
}
