package ArrayProblems;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target  = 3;
        System.out.println(Arrays.toString(twoSumWithHashMap(arr, target)));
    }
    public static int[] twoSum(int[] nums, int target){
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length-1;

        while(l<r){
            int sum = nums[l] + nums[r];
            if(sum == target){
                return new int[]{l, r};
            }else if (sum < target) l++;
            else r--;
        }
        return new int[]{};
    }

    public static int[] twoSumWithHashMap(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0; i< nums.length; i++){
            int num = nums[i];
            int moreNeeded = target - num;
            if (map.containsKey(moreNeeded)){
                return new int[]{map.get(moreNeeded), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public static int[] twoSumN(int[] numbers, int target) {
        int[] ans = {};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    if (numbers[i] + numbers[j] == target) {
                        ans = new int[]{numbers[i], numbers[j]};
                    }
                }
            }
        }
        return ans;
    }
}