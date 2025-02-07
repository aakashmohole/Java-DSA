package Array2DProblems;

import java.util.Arrays;

public class setMatrixZero73 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        printMatrix(setZeroes(matrix));
    }
    public static int[][]  setZeroes(int[][] matrix) {
       int n = matrix.length;
       int m = matrix[0].length;

       boolean[] col = new boolean[n];
       boolean[] row = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
        }
    }
}
