package stringProblems;

import java.util.Arrays;
import java.util.Collections;

public class nextPermutation31 {

    /*
     * 1. Find the pivot element, e.g., 1 3 2 7 6 5 -> 2 is pivot
     * 2. Find the rightmost element greater than pivot
     * 3. Swap (RME with pivot)
     * 4. Reverse elements from pivot+1 to n-1
     * */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        // 1. Find pivot element
        int pivot = -1;
        for (int i = nums.length - 2; i >= 0; i--) { // Fix: Start from nums.length - 2
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            // Reverse the array if no pivot is found
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // 2. Find the next largest element
        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // 3. Reverse the subarray (pivot+1 to n-1)
        reverse(nums, pivot + 1, nums.length - 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
