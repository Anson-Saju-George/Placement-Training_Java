// 05_TypeConversion.java
// Demonstrates Widening and Narrowing Type Conversion in Java

public class _005_TypeConversion {
    public static void main(String[] args) {

        System.out.println("=== Widening (Implicit) Conversion ===");

        // byte → short → int → long → float → double
        byte b = 100;
        short s = b;      // byte to short
        int i = s;        // short to int
        long l = i;       // int to long
        float f = l;      // long to float
        double d = f;     // float to double

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println("\n=== Narrowing (Explicit) Conversion ===");

        // Use max values to show overflow effects
        double d2 = 1234567.89;
        float f2 = (float) d2;     // double to float
        long l2 = (long) f2;       // float to long
        int i2 = (int) l2;         // long to int
        short s2 = (short) i2;     // int to short
        byte b2 = (byte) s2;       // short to byte

        System.out.println("double: " + d2);
        System.out.println("float: " + f2);
        System.out.println("long: " + l2);
        System.out.println("int: " + i2);
        System.out.println("short: " + s2);
        System.out.println("byte: " + b2);  // possible data loss

        System.out.println("\n=== Real-world example: Overflow Check ===");

        int high = 130;
        byte narrow = (byte) high;
        System.out.println("Original int: " + high);
        System.out.println("After narrowing to byte: " + narrow);  // Shows overflow (130 → -126)

        System.out.println("\n=== Char to Int and Vice Versa ===");
        char ch = 'A';
        int chVal = ch;
        char chFromInt = (char) (chVal + 1);
        System.out.println("Char: " + ch);
        System.out.println("Char to int: " + chVal);
        System.out.println("Int to char (A+1): " + chFromInt);  // Should be 'B'
    }
}
