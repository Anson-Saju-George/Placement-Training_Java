// 08_Loops.java
// Demonstrates various types of loops in Java

public class _008_Loops {
    public static void main(String[] args) {

        System.out.println("=== For Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        System.out.println("\n=== While Loop ===");
        int j = 1;
        while (j <= 5) {
            System.out.println("Count: " + j);
            j++;
        }

        System.out.println("\n=== Do-While Loop ===");
        int k = 1;
        do {
            System.out.println("Count: " + k);
            k++;
        } while (k <= 5);

        System.out.println("\n=== Break and Continue ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue; // skip this iteration
            }
            if (i == 7) {
                break; // exit loop when i is 7
            }
            System.out.println("Value: " + i);
        }

        System.out.println("\n=== Enhanced For Loop ===");
        int[] nums = {10, 20, 30, 40, 50};
        for (int val : nums) {
            System.out.println("Array element: " + val);
        }
    }
}
