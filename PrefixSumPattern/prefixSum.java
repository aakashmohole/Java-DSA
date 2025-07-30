package PrefixSumPattern;

import java.util.Arrays;

public class prefixSum {
    /*
    * prefix sum is pattern that help to solve problems related to ranges some examples are
    * 1 range sum query
    * 2 maximum subarray sum
    * */
    public static void main(String[] args) {
        //basic template is as
        int[] arr = {3,7,2,5,8};
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        System.out.println(Arrays.toString(prefixSum));

        //also another approach sum in place

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] +arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
