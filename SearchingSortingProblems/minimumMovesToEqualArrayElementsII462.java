package SearchingSortingProblems;

import java.util.Arrays;

public class minimumMovesToEqualArrayElementsII462 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(minMoves2(nums));
    }
    public static int minMoves2(int[] nums) {
        int n = nums.length;

        // Sort the array
        Arrays.sort(nums);

        // Find the median
        int median = nums[n / 2];

        // Calculate the minimum steps
        int steps = 0;
        for (int num : nums) {
            steps += Math.abs(num - median);
        }

        return steps;
    }
}
