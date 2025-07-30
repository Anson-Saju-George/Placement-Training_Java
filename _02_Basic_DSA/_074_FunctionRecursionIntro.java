// _074_FunctionRecursionIntro.java
public class _074_FunctionRecursionIntro {

    static void countdown(int n) {
        if (n == 0) {
            System.out.println("Liftoff!");
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Countdown from 5:");
        countdown(5);

        System.out.println("\nFactorial of 5 = " + factorial(5));
    }
}
