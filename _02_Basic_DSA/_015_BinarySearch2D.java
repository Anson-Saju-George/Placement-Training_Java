// _015_BinarySearch2D.java
// Binary Search on a sorted 2D matrix (row-wise and column-wise sorted)

import java.util.Scanner;

public class _015_BinarySearch2D {

    public static boolean binarySearch2D(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int r = 0, c = cols - 1;

        while (r < rows && c >= 0) {
            if (matrix[r][c] == target) return true;
            else if (matrix[r][c] > target) c--;
            else r++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {
            {1, 4, 7, 11},
            {12, 15, 18, 22},
            {23, 26, 30, 34}
        };

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        if (binarySearch2D(matrix, key)) {
            System.out.println("Element found in the matrix.");
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
