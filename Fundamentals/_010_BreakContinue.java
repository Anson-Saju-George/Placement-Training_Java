// 10_BreakContinue.java
// Demonstrates usage of break and continue in Java loops

public class _010_BreakContinue {
    public static void main(String[] args) {

        System.out.println("=== Break Example ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break; // exits loop when i = 5
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n=== Continue Example ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue; // skips the rest of loop body when i = 3
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n=== Continue in While Loop ===");
        int j = 0;
        while (j < 5) {
            j++;
            if (j == 2) {
                System.out.println("Skipping j = " + j);
                continue;
            }
            System.out.println("j = " + j);
        }

        System.out.println("\n=== Break in While Loop ===");
        int k = 0;
        while (k < 5) {
            if (k == 3) {
                System.out.println("Breaking at k = " + k);
                break;
            }
            System.out.println("k = " + k);
            k++;
        }

        System.out.println("\n=== Nested Loop with Break ===");
        for (int outer = 1; outer <= 3; outer++) {
            for (int inner = 1; inner <= 3; inner++) {
                if (inner == 2) {
                    break;
                }
                System.out.println("outer = " + outer + ", inner = " + inner);
            }
        }
    }
}
