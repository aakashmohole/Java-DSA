package Array2DProblems;
/*
Brout force
Primary Diagonal : i == j
Secondary Diagonal : i+j = n-1

optimal
primary : matrix[i][i]
secondary : j = n-1-i
*/
public class diagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(findSumOptimal(matrix));
    }
    public static int findSumOptimal(int[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {

            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal
            if (i != matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static int findSum(int[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i+j == matrix.length-1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

}
