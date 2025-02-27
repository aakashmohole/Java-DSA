package Backtracking;

import java.util.Arrays;

public class nQueensPosibleProblem {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        //initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        if (backtrack(board, 0)){
            System.out.println("Solution Possible: ");
            printBoard(board);
        }else {
            System.out.println("Solution is not possible!");
        }
    }


    public static boolean backtrack(char[][] board, int row) {
        if (row == board.length) {
//            count++;
            return true;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                if(backtrack(board, row + 1)){
                    return true;
                }
                board[row][col] = '.'; // backtrack
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check diagonal left-up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check diagonal right-up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
    public static void printBoard(char[][] board){
        System.out.println("______ chess board _______");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
