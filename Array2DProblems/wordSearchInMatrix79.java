package Array2DProblems;

public class wordSearchInMatrix79 {
    public static void main(String[] args) {

    }
    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int k = 0;
            for (int j = 0; j < board.length; j++) {
//                for (int k = 0; k < board.length; k++) {
//                    if (ch != board[j][k]){
//                        board[][]
//                    }
                while (k < board.length){
                    if (ch != board[j][k]){
                        j++;
                        k = k-1;
                    }
                }
            }
        }
        return true;

    }
}
