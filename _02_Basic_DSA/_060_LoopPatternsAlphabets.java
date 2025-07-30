// _060_LoopPatternsAlphabets.java
public class _060_LoopPatternsAlphabets {
    public static void main(String[] args) {
        System.out.println("=== Alphabet Patterns ===");

        int n = 5;

        System.out.println("\nPattern A to E:");
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        System.out.println("\nReverse Alphabet Triangle:");
        for (int i = n; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        System.out.println("\nRepeated Alphabets in Rows:");
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
