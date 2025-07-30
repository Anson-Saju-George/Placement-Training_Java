// _013_Recursion.java
// Demonstrates basic recursion concepts in Java

public class _013_Recursion {

    // Basic recursion: prints numbers from n to 1
    static void printDescending(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printDescending(n - 1);
    }

    // Basic recursion: prints numbers from 1 to n
    static void printAscending(int n) {
        if (n == 0) return;
        printAscending(n - 1);
        System.out.print(n + " ");
    }

    // Factorial using recursion
    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Fibonacci using recursion (inefficient)
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Sum of natural numbers
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("=== Recursion Examples ===");

        System.out.print("Print 5 to 1: ");
        printDescending(5);
        System.out.println();

        System.out.print("Print 1 to 5: ");
        printAscending(5);
        System.out.println();

        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Fibonacci at position 6: " + fibonacci(6));
        System.out.println("Sum of first 5 natural numbers: " + sum(5));
    }
}
