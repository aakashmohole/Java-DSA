package neetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class slidingWindowMaximum239 {
    public static void main(String[] args) {
        int[] nums = {1,-1}; int k =1;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
//        int max=Integer.MIN_VALUE;
        int[] result = new int[nums.length - k + 1]; // The number of windows is n - k + 1
        int resultIndex = 0;


        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }


        int start = 0; int end =k-1;
        while(end<nums.length){
            int max = Integer.MIN_VALUE; // Reset max for each window
            for (int i = start; i <= end; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            result[resultIndex++] = max;
            start++;
            end++;
        }
        return result;
    }
}
