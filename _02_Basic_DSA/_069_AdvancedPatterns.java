// _069_AdvancedPatterns.java
public class _069_AdvancedPatterns {
    public static void main(String[] args) {
        int n = 5;

        // Floyd's Triangle
        System.out.println("Floyd's Triangle:");
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }

        // 0-1 Triangle
        System.out.println("\n0-1 Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(((i + j) % 2 == 0 ? "1" : "0") + " ");
            }
            System.out.println();
        }
    }
}
