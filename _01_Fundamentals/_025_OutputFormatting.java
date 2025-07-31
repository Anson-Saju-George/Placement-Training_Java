// _025_OutputFormatting.java
// Demonstrates formatted output using printf and String.format

public class _025_OutputFormatting {
    public static void main(String[] args) {

        System.out.println("=== Output Formatting Example ===");

        int id = 7;
        String name = "Alice";
        double marks = 91.56789;

        // Basic formatted output
        System.out.printf("ID: %d\n", id);
        System.out.printf("Name: %s\n", name);
        System.out.printf("Marks: %.2f\n", marks); // rounding to 2 decimal places

        // Padding and alignment
        System.out.printf("\n%-10s %-10s %-10s\n", "ID", "Name", "Marks");
        System.out.printf("%-10d %-10s %-10.2f\n", id, name, marks);

        int id2 = 23;
        String name2 = "Bob";
        double marks2 = 86.2;

        System.out.printf("%-10d %-10s %-10.2f\n", id2, name2, marks2);

        // Padding with zeros
        System.out.printf("\nPadded ID: %05d\n", id);

        // Using String.format
        String formatted = String.format("Hello, %s. Your score is %.1f%%", name, marks);
        System.out.println(formatted);
    }
}
