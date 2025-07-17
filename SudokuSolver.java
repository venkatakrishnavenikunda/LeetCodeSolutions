package Normal_Prgms;

public class SudokuSolver {
    private char[][] board;
    public void solveSudoku(char[][] board) {
        this.board = board;
        helper(0, 0);
    }

    private boolean helper(int row, int col) {
        if (col == 9) {
            row += 1;
            col = 0;
        }
        if (row == 9) return true;
        if (board[row][col] != '.') {
            return helper(row, col + 1);
        }
        for (char i = '1'; i <= '9'; i++) {
            if (isValid(row, col, i)) {
                board[row][col] = i;

                if (helper(row, col + 1)) {
                    return true;
                }

                board[row][col] = '.';
            }
        }
        return false;
    }
    private boolean isValid(int row, int col, char cur) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == cur) return false;
            if (board[i][col] == cur) return false;
        }
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == cur) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        SudokuSolver solver = new SudokuSolver();
        solver.solveSudoku(board);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}



//Leetcode Solution
//class Solution {
//    private char[][] board;
//    public void solveSudoku(char[][] board) {
//        this.board = board;
//        helper(0, 0);
//    }
//    private boolean helper(int row, int col) {
//        if (col == 9) {
//            row += 1;
//            col = 0;
//        }
//        if (row == 9) return true;
//        if (board[row][col] != '.') {
//            return helper(row, col + 1);
//        }
//        for (char i = '1'; i <= '9'; i++) {
//            if (isValid(row, col, i)) {
//                board[row][col] = i;
//
//                if (helper(row, col + 1)) {
//                    return true;
//                }
//
//                board[row][col] = '.'; // backtrack
//            }
//        }
//        return false;
//    }
//    private boolean isValid(int row, int col, char cur) {
//        for (int i = 0; i < 9; i++) {
//            if (board[row][i] == cur) return false;
//            if (board[i][col] == cur) return false;
//        }
//        int startRow = (row / 3) * 3;
//        int startCol = (col / 3) * 3;
//        for (int i = startRow; i < startRow + 3; i++) {
//            for (int j = startCol; j < startCol + 3; j++) {
//                if (board[i][j] == cur) return false;
//            }
//        }
//        return true;
//    }
//}
