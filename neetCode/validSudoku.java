package neetCode;

import java.util.HashSet;

public class validSudoku {
    public static void main(String[] args) {

    }

    public static boolean isValidSudoku(char[][] board){
        int N = 9;
        //create hashsets to record the status
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for (int r = 0; r < N; r++) {
            rows[r] = new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                char val = board[r][c];

                //check value is filled with number
                if (val == '.'){
                    continue;
                }

                //check the row
                if (rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);

                //check the col
                if (cols[c].contains(val)){
                    return false;
                }
                cols[c].add(val);

                //check the boxes
                int i = (r/3) * 3 + c/3;
                if (boxes[i].contains(val)){
                    return false;
                }
                boxes[i].add(val);
            }
        }
        return true;
    }
}
