// _052_BitwiseOperators.java
// Demonstrates bitwise operators in Java

public class _052_BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;    // 0101
        int b = 3;    // 0011

        System.out.println("a = " + a + ", b = " + b);

        // AND
        System.out.println("a & b = " + (a & b));   // 0001 = 1

        // OR
        System.out.println("a | b = " + (a | b));   // 0111 = 7

        // XOR
        System.out.println("a ^ b = " + (a ^ b));   // 0110 = 6

        // NOT
        System.out.println("~a = " + (~a));         // Inverts all bits

        // Left Shift
        System.out.println("a << 1 = " + (a << 1)); // 1010 = 10

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1)); // 0010 = 2

        // Unsigned Right Shift
        int negative = -8;
        System.out.println("negative >>> 1 = " + (negative >>> 1)); // Logical shift
    }
}
