package Array2DProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class diagonalTraverse498 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(findDiagonalOrder(mat)));
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0 || mat[0].length == 0) return new int[0];

        int m = mat.length, n = mat[0].length;

        int[] ans = new int[m*n];
        int i = 0, row = 0, col = 0;
        boolean up = true;

        while(row < m && col < n){
            // if diagonal is going up
            if (up){
                while (row > 0 && col <n-1){
                    ans[i++] = mat[row][col];
                    row--;
                    col++;
                }
                ans[i++] = mat[row][col];
                if (col == n-1){
                    row++;
                }else {
                    col++;
                }
            }else {
                while (col > 0 && row <m-1){
                    ans[i++] = mat[row][col];

                    row++;
                    col--;
                }
                ans[i++] = mat[row][col];
                if (row== m-1){
                    col++;
                }else {
                    row++;
                }
            }
            // or down
            up =! up;
        }
        return ans;

    }
}
