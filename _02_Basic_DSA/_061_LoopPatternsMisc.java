// _061_LoopPatternsMisc.java
public class _061_LoopPatternsMisc {
    public static void main(String[] args) {
        System.out.println("=== Miscellaneous Patterns ===");

        int n = 5;

        System.out.println("\nDiamond Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("\nNumber Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }

        System.out.println("\nPascal's Triangle:");
        for (int line = 1; line <= n; line++) {
            int num = 1;
            for (int j = 0; j < n - line; j++)
                System.out.print(" ");
            for (int i = 1; i <= line; i++) {
                System.out.print(num + " ");
                num = num * (line - i) / i;
            }
            System.out.println();
        }
    }
}
