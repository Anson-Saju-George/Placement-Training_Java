// 06_Operators.java
// Demonstrates different types of operators in Java

public class _006_Operators {
    public static void main(String[] args) {

        System.out.println("=== Arithmetic Operators ===");

        int a = 10, b = 3;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        System.out.println("\n=== Assignment Operators ===");

        int x = 5;
        System.out.println("x = " + x);
        x += 3;  // x = x + 3
        System.out.println("x += 3 → " + x);
        x *= 2;  // x = x * 2
        System.out.println("x *= 2 → " + x);

        System.out.println("\n=== Relational / Comparison Operators ===");

        int p = 10, q = 20;
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("p == q: " + (p == q));
        System.out.println("p != q: " + (p != q));
        System.out.println("p > q: " + (p > q));
        System.out.println("p < q: " + (p < q));
        System.out.println("p >= q: " + (p >= q));
        System.out.println("p <= q: " + (p <= q));

        System.out.println("\n=== Logical Operators ===");

        boolean bool1 = true, bool2 = false;
        System.out.println("bool1 && bool2: " + (bool1 && bool2));  // AND
        System.out.println("bool1 || bool2: " + (bool1 || bool2));  // OR
        System.out.println("!bool1: " + (!bool1));                  // NOT

        System.out.println("\n=== Unary Operators ===");

        int num = 5;
        System.out.println("num = " + num);
        System.out.println("++num: " + (++num));  // Pre-increment
        System.out.println("num++: " + (num++));  // Post-increment
        System.out.println("After num++ → " + num);
        System.out.println("--num: " + (--num));  // Pre-decrement

        System.out.println("\n=== Bitwise Operators ===");

        int bitA = 5;  // 0101
        int bitB = 3;  // 0011
        System.out.println("bitA & bitB: " + (bitA & bitB));  // AND
        System.out.println("bitA | bitB: " + (bitA | bitB));  // OR
        System.out.println("bitA ^ bitB: " + (bitA ^ bitB));  // XOR
        System.out.println("~bitA: " + (~bitA));              // NOT
        System.out.println("bitA << 1: " + (bitA << 1));       // Left shift
        System.out.println("bitA >> 1: " + (bitA >> 1));       // Right shift

        System.out.println("\n=== Ternary Operator ===");

        int age = 18;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age is " + age + " → " + status);
    }
}
