package Backtracking;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(permute(arr));
    }
    public static void findPermutation(String str, String ans){
        //base case
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            //"abc" => "bc" ---> substring(0,i) + substring(i+1)
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(newStr, ans+curr);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums,0,result);
        return result;

    }

    private static void helper(int[] nums, int ind, List<List<Integer>> ansList) {
        if (ind == nums.length) {
            List<Integer> subList = new ArrayList<>();
            for (int num : nums) {
                subList.add(num);
            }
            ansList.add(subList);
            return;
        }

        for (int i = ind; i < nums.length; i++) {
            //recursion
            swap(nums, ind, i);
            helper(nums, ind + 1, ansList);

            //backtracking
            swap(nums, ind, i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
