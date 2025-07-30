// _054_LabeledBreakContinue.java
// Demonstrates the use of labeled break and continue in nested loops

public class _054_LabeledBreakContinue {
    public static void main(String[] args) {
        System.out.println("=== Labeled Break ===");
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop; // breaks out of both loops
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        System.out.println("\n=== Labeled Continue ===");
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue outer; // skips to next iteration of outer loop
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}
