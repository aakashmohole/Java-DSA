package Array2DProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class repeatAndMissingNumbers {
    public static void main(String[] args) {
        int[][] arr = {
                { 9,1,7 },
                { 8,9,2 },
                { 3,4,6 }
        };
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(arr)));
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> seenSet = new HashSet<>();
        int missing = -1, repeated = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {

                if (seenSet.contains(grid[i][j])){
                    repeated = grid[i][j];
                }else {
                    seenSet.add(grid[i][j]);
                }
            }
        }
        for (int i = 1; i <= grid.length * grid.length; i++) {
            if(!seenSet.contains(i)){
                missing = i;
                break;
            }
        }
        return new int[]{repeated, missing};
    }
}
