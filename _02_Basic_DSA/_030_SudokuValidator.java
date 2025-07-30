// _030_SudokuValidator.java
// Validates whether a given 9x9 Sudoku board is valid

public class _030_SudokuValidator {

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];
            boolean[] box = new boolean[9];

            for (int j = 0; j < 9; j++) {
                // Check row
                if (board[i][j] != '.') {
                    int idx = board[i][j] - '1';
                    if (row[idx]) return false;
                    row[idx] = true;
                }

                // Check column
                if (board[j][i] != '.') {
                    int idx = board[j][i] - '1';
                    if (col[idx]) return false;
                    col[idx] = true;
                }

                // Check box
                int rowIndex = 3 * (i / 3);
                int colIndex = 3 * (i % 3);
                int r = rowIndex + j / 3;
                int c = colIndex + j % 3;
                if (board[r][c] != '.') {
                    int idx = board[r][c] - '1';
                    if (box[idx]) return false;
                    box[idx] = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        boolean valid = isValidSudoku(board);
        System.out.println("Is the Sudoku board valid? " + valid);
    }
}
