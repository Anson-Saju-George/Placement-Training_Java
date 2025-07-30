// _066_PyramidPatterns.java
// Menu-driven pyramid pattern generator

import java.util.Scanner;

public class _066_PyramidPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, rows;

        do {
            System.out.println("\n=== Pyramid Pattern Menu ===");
            System.out.println("1. Half Pyramid (Stars)");
            System.out.println("2. Half Pyramid (Numbers)");
            System.out.println("3. Inverted Half Pyramid");
            System.out.println("4. Full Pyramid (Stars)");
            System.out.println("5. Inverted Full Pyramid");
            System.out.println("6. Floyd’s Triangle");
            System.out.println("7. 0-1 Triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) break;

            System.out.print("Enter number of rows: ");
            rows = sc.nextInt();

            switch (choice) {
                case 1:
                    halfPyramidStars(rows);
                    break;
                case 2:
                    halfPyramidNumbers(rows);
                    break;
                case 3:
                    invertedHalfPyramid(rows);
                    break;
                case 4:
                    fullPyramidStars(rows);
                    break;
                case 5:
                    invertedFullPyramid(rows);
                    break;
                case 6:
                    floydsTriangle(rows);
                    break;
                case 7:
                    zeroOneTriangle(rows);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }

    static void halfPyramidStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("* ".repeat(i));
        }
    }

    static void halfPyramidNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    static void invertedHalfPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println("* ".repeat(i));
        }
    }

    static void fullPyramidStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("  ".repeat(n - i));
            System.out.println("* ".repeat(i));
        }
    }

    static void invertedFullPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print("  ".repeat(n - i));
            System.out.println("* ".repeat(i));
        }
    }

    static void floydsTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(num++ + " ");
            System.out.println();
        }
    }

    static void zeroOneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
