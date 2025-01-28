package ArrayProblems;

import java.util.Arrays;

// 1. sort array
// 2. i = 0; j = m-1;
// 3. diff = min(d, arr[j] - arr[i])

public class chocolateDistributionProblem {
    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;

        System.out.println(findDiff(arr, m));
    }
    public static int findDiff(int[] arr, int m){
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        int j = m-1, i =0;
        while(j < arr.length){
            diff = Math.min(diff, (arr[j] - arr[i]));
            j++;
            i++;
        }
        return diff;
    }
}
