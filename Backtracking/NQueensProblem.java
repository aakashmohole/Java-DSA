package Backtracking;

public class NQueensProblem {

    public static void main(String[] args) {
       int n = 4;
       char[][] board = new char[n][n];

       //initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
    }

    public static void nQueens(char[][] board, int row){
        // base case
        if(row == board.length){
            printBoard(board);
            return;
        }
        //col loop
        for (int j = 0; j < board.length; j++) {
            //check condition the place is safe for placing queen
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1); //Recursion call
                board[row][j] = 'X'; //backtrack step
            }

        }
    }

    //Check Safe Condition for Queens
    public static boolean isSafe(char[][] board, int row, int col){
        //vertical check
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == 'Q'){
                return false;
            }
        }

        //diagonal left up
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        //diagonal right up
        for (int i = row-1, j=col+1; i >=0 && j<board.length ; i--, j++){
            if (board[i][j] == 'Q'){
                return false;
            }
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
