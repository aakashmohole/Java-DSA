package ArrayProblems;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target  = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    int[] a = {i, j};
                    System.out.println(Arrays.toString(a));
                }
            }
        }
    }
}
