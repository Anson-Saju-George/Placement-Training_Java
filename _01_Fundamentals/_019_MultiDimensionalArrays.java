// _019_MultiDimensionalArrays.java
// Demonstrates 2D arrays (multi-dimensional arrays) in Java

import java.util.Scanner;
import java.util.Arrays;

public class _019_MultiDimensionalArrays {
    public static void main(String[] args) {

        System.out.println("=== Multi-Dimensional Arrays ===");

        Scanner sc = new Scanner(System.in);

        // Declare and initialize a 2D array (3 rows x 2 columns)
        int[][] matrix = new int[3][2];

        // Input values into the 2D array
        System.out.println("Enter values for 3x2 matrix:");
        for (int i = 0; i < matrix.length; i++) {         // rows
            for (int j = 0; j < matrix[i].length; j++) {  // columns
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("\nMatrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }

        // Access specific element
        System.out.println("\nElement at (1,1): " + matrix[1][1]);

        // Using Arrays.deepToString to print entire matrix
        System.out.println("\nMatrix using Arrays.deepToString():");
        System.out.println(Arrays.deepToString(matrix));

        sc.close();
    }
}
