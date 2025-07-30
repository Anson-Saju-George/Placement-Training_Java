// _027_BinarySearch2D.java
// Perform binary search in a sorted 2D matrix (row-wise and column-wise sorted)

import java.util.Scanner;

public class _027_BinarySearch2D {

    public static boolean binarySearch2D(int[][] matrix, int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key)
                return true;
            else if (matrix[row][col] > key)
                col--;
            else
                row++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] matrix = new int[m][n];

        System.out.println("Enter sorted 2D matrix:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        if (binarySearch2D(matrix, key))
            System.out.println("Element found!");
        else
            System.out.println("Element not found!");

        sc.close();
    }
}
