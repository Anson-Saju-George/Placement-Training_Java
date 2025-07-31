// _027_MiniPracticeSet.java
// A mini practice set using basics: input, loops, conditionals, functions

import java.util.Scanner;

public class _027_MiniPracticeSet {

    // Function to check if number is even or odd
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Function to calculate factorial
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to print multiplication table
    public static void printTable(int n) {
        System.out.println("Multiplication table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // Function to count digits in a number
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\n=== Mini Practice Set Output ===");
        System.out.println("Even or Odd: " + (isEven(num) ? "Even" : "Odd"));
        System.out.println("Factorial: " + factorial(num));
        printTable(num);
        System.out.println("Digit Count: " + countDigits(num));
        System.out.println("Prime Check: " + (isPrime(num) ? "Prime" : "Not Prime"));

        sc.close();
    }
}
