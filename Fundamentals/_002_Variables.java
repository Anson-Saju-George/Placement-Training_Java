// 02_Variables.java
// Demonstrates variable types, type conversion, and reverse conversion in Java

public class _002_Variables {
    public static void main(String[] args) {

        System.out.println("=== Variable Types ===");

        // Primitive Data Types
        byte byteVal = 100;
        short shortVal = 10000;
        int intVal = 100000;
        long longVal = 10000000000L;
        float floatVal = 5.75f;
        double doubleVal = 19.99;
        char charVal = 'A';
        boolean boolVal = true;

        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + charVal);
        System.out.println("boolean: " + boolVal);

        System.out.println("\n=== Type Conversion (Widening) ===");

        // Widening (automatic conversion)
        int i = 10;
        long l = i;        // int to long
        float f = l;       // long to float
        double d = f;      // float to double

        System.out.println("int to long: " + l);
        System.out.println("long to float: " + f);
        System.out.println("float to double: " + d);

        System.out.println("\n=== Type Conversion (Narrowing) ===");

        // Narrowing (manual casting required)
        double d2 = 9.78;
        float f2 = (float) d2;    // double to float
        long l2 = (long) f2;      // float to long
        int i2 = (int) l2;        // long to int
        short s2 = (short) i2;    // int to short
        byte b2 = (byte) s2;      // short to byte

        System.out.println("double to float: " + f2);
        System.out.println("float to long: " + l2);
        System.out.println("long to int: " + i2);
        System.out.println("int to short: " + s2);
        System.out.println("short to byte: " + b2);
    }
}
