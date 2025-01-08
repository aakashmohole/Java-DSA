package SearchingSortingProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class lastOccurrenceInSortedArray34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        // Default result when target is not found
        int[] result = {-1, -1};

        // Find the first occurrence of target
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                break;
            }
        }

        // If target is not found in the array, return [-1, -1]
        if (result[0] == -1) {
            return result;
        }

        // Find the last occurrence of target
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                result[1] = i;
                break;
            }
        }

        return result;
    }

}
