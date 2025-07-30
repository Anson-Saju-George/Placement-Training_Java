// _073_FunctionPracticeSet.java
public class _073_FunctionPracticeSet {

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static boolean isPalindrome(int n) {
        int original = n, reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        System.out.println("Max of 10 & 20: " + max(10, 20));
        System.out.println("Sum of digits of 1234: " + sumOfDigits(1234));
        System.out.println("Is 121 a palindrome? " + isPalindrome(121));
    }
}
