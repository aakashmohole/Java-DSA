package Backtracking;

public class NQueensProblem {

    public static void main(String[] args) {
        int n = 5;
        //ches board
        char board[][] = new char[n][n];

        //initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        if(nQueens(board, 0)){
            System.out.println("Solution is Possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not Possible");
        }
//        System.out.println("Total ways to solve n queens : " +count);
    }

    static  boolean isSafe(char board[][], int row, int col){
        //vertical up
        for (int i = row-1; i >=0 ; i--) {
            if (board[i][col] == 'Q' ){
                return false;
            }
        }

        //diagonal left up
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        //diagonal right up
        for (int i=row-1, j=col+1; i>=0 && j< board.length; i--, j++ ){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    static int count = 0;
    static boolean nQueens(char board[][], int row){
        //base case
        if(row == board.length){
//            printBoard(board);
            count ++;
            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                //Function Call
                if (nQueens(board, row+1)){
                    return true;
                }
                board[row][j] = 'X'; //Backtracking
            }

        }
        return false;
    }

    static void printBoard(char board[][]){
        System.out.println("--------------- chess board-------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " " );
            }
            System.out.println();
        }
    }
}
