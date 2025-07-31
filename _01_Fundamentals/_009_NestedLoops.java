// 09_NestedLoops.java
// Demonstrates nested loops in Java

public class _009_NestedLoops {
    public static void main(String[] args) {

        System.out.println("=== Nested For Loops (Multiplication Table) ===");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println(); // new line after inner loop
        }

        System.out.println("\n=== Nested Loop to Print Pattern ===");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }

        System.out.println("\n=== Nested Loop with Characters ===");
        char ch = 'A';
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        System.out.println("\n=== Labeled Break (Exits Outer Loop) ===");
        outer:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outer; // breaks out of both loops
                }
                System.out.print(i + "," + j + "  ");
            }
            System.out.println();
        }
    }
}
