// 03_InputOutput.java
// Demonstrates input and output operations in Java using Scanner
// Also shows formatted output (e.g., fixed decimal places and leading zeros)

import java.util.Scanner;

public class _003_InputOutput {
    public static void main(String[] args) {

        // Create a Scanner object for reading input
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Input and Output Example ===");

        // Taking input of different types
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();  // input integer

        System.out.print("Enter a float: ");
        float decimal = sc.nextFloat();  // input float

        System.out.print("Enter a double: ");
        double precise = sc.nextDouble();  // input double

        System.out.print("Enter a string (single word): ");
        String word = sc.next();  // input single word

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter a full line: ");
        String sentence = sc.nextLine();  // input full line

        // Output all values
        System.out.println("\n=== Raw Output ===");
        System.out.println("Integer: " + num);
        System.out.println("Float: " + decimal);
        System.out.println("Double: " + precise);
        System.out.println("Word: " + word);
        System.out.println("Full line: " + sentence);

        // Formatted Output (fixed decimal places)
        System.out.println("\n=== Formatted Output ===");
        System.out.printf("Float (2 decimals): %.2f\n", decimal);
        System.out.printf("Double (3 decimals): %.3f\n", precise);
        System.out.printf("Integer with padding: %05d\n", num); // padded with zeros

        // Arithmetic operation with formatted result
        double sum = num + decimal + precise;
        System.out.printf("\nSum of all numbers = %.2f\n", sum);

        // Showing Leading Zero Formatting for All
        System.out.println("\n=== Leading Zeros Formatting (MSB) ===");
        System.out.printf("Integer padded to 6 digits: %06d\n", num);           // e.g. 000042
        System.out.printf("Float padded to 7 chars: %07.2f\n", decimal);        // e.g. 0012.50
        System.out.printf("Double padded to 9 chars: %09.3f\n", precise);       // e.g. 00009.876
        System.out.printf("Sum padded (10 chars): %010.2f\n", sum);             // e.g. 000067.12

        // Close the scanner
        sc.close();
    }
}
