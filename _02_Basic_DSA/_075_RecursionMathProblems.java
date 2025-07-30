// _075_RecursionMathProblems.java
public class _075_RecursionMathProblems {

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    static int sumTillN(int n) {
        if (n == 0) return 0;
        return n + sumTillN(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("GCD of 48 and 18: " + gcd(48, 18));
        System.out.println("2^5 = " + power(2, 5));
        System.out.println("Sum till 5 = " + sumTillN(5));
    }
}
