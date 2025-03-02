package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ansList = new ArrayList<>();

        Arrays.sort(nums); // Sorting to use two-pointer approach

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate `i`

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // Skip duplicate `j`

                int p = j + 1, q = n - 1;

                while (p < q) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[p] + (long) nums[q];

                    if (sum < target) {
                        p++;
                    } else if (sum > target) {
                        q--;
                    } else {
                        ansList.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));

                        // Move p forward and q backward while skipping duplicates
                        while (p < q && nums[p] == nums[p + 1]) p++;
                        while (p < q && nums[q] == nums[q - 1]) q--;

                        p++;
                        q--;
                    }
                }
            }
        }
        return ansList;
    }

}
