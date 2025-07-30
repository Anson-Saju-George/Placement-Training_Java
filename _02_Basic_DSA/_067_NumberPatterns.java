// _067_NumberPatterns.java
public class _067_NumberPatterns {
    public static void main(String[] args) {
        int n = 5;

        // Pattern 1: Increasing numbers
        System.out.println("Pattern 1:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Pattern 2: Same numbers in a row
        System.out.println("\nPattern 2:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Pattern 3: Decreasing numbers
        System.out.println("\nPattern 3:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
