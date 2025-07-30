// _064_PatternsIntro.java
// Basic pattern printing using nested loops

public class _064_PatternsIntro {
    public static void main(String[] args) {
        System.out.println("Basic Patterns:");

        // Pattern 1: Solid Rectangle
        int rows = 4;
        int cols = 5;

        System.out.println("\nPattern 1: Solid Rectangle");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 2: Right-angled Triangle
        System.out.println("\nPattern 2: Right-Angled Triangle");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 3: Inverted Triangle
        System.out.println("\nPattern 3: Inverted Triangle");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 4: Right-Aligned Triangle
        System.out.println("\nPattern 4: Right-Aligned Triangle");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
