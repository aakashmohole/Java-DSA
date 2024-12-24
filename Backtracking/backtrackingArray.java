package Backtracking;

import java.util.Arrays;

public class backtrackingArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void changeArr(int[] arr, int i, int val){
        // base condition
        if( i == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        // recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);

        // backtracking
        arr[i] = arr[i] - 2;
    }
}
