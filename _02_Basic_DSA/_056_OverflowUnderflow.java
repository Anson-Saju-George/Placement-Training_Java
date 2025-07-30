// _056_OverflowUnderflow.java
public class _056_OverflowUnderflow {
    public static void main(String[] args) {

        System.out.println("=== Overflow & Underflow Demo ===");

        byte b = 127; // max value for byte
        b++;          // causes overflow
        System.out.println("Byte Overflow: " + b); // wraps to -128

        b = -128;     
        b--;          // causes underflow
        System.out.println("Byte Underflow: " + b); // wraps to 127

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("\nMax Integer: " + max);
        System.out.println("Max Integer + 1: " + (max + 1)); // overflow

        System.out.println("Min Integer: " + min);
        System.out.println("Min Integer - 1: " + (min - 1)); // underflow

        // Behavior with multiplication
        int large = 1_000_000;
        int product = large * large; // overflows silently
        System.out.println("\nExpected 1_000_000^2, got: " + product);

        // Correct way using long to avoid overflow
        long safeProduct = 1_000_000L * 1_000_000;
        System.out.println("Safe Product (using long): " + safeProduct);
    }
}
