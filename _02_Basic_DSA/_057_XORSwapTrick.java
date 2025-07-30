// _057_XORSwapTrick.java
public class _057_XORSwapTrick {
    public static void main(String[] args) {

        System.out.println("=== XOR Swap Trick ===");

        int a = 5;
        int b = 10;

        System.out.println("Before Swap:");
        System.out.println("a = " + a + ", b = " + b);

        // XOR swap
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swap using XOR:");
        System.out.println("a = " + a + ", b = " + b);

        // XOR swap works only with primitive integer types
    }
}
