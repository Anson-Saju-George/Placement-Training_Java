// _034_SymmetricMatrix.java
// Checks if a matrix is symmetric (i.e., matrix == transpose of itself)

public class _034_SymmetricMatrix {

    public static boolean isSymmetric(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) return false;  // Must be square

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        int[][] matrix2 = {
            {1, 0, 1},
            {0, 1, 0},
            {1, 1, 1}
        };

        System.out.println("Matrix 1 is symmetric? " + isSymmetric(matrix1));
        System.out.println("Matrix 2 is symmetric? " + isSymmetric(matrix2));
    }
}
