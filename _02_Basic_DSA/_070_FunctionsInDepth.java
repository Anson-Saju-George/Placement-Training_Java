// _070_FunctionsInDepth.java
public class _070_FunctionsInDepth {

    static int sum(int a, int b) {
        return a + b;
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 10 + 20 = " + sum(10, 20));
        System.out.println("Factorial of 5 = " + factorial(5));
        System.out.println("Is 42 even? " + isEven(42));
    }
}
