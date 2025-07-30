// _055_JavaShorthandOps.java
// Demonstrates Java shorthand assignment operators

public class _055_JavaShorthandOps {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Initial values: a = " + a + ", b = " + b);

        a += b;  // a = a + b
        System.out.println("After a += b: " + a);

        a -= b;  // a = a - b
        System.out.println("After a -= b: " + a);

        a *= b;  // a = a * b
        System.out.println("After a *= b: " + a);

        a /= b;  // a = a / b
        System.out.println("After a /= b: " + a);

        a %= b;  // a = a % b
        System.out.println("After a %= b: " + a);
    }
}
