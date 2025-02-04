package ArrayProblems;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target  = 6;
        System.out.println(Arrays.toString(twoSumWithHashMap(arr, target)));
//        for (int i = 0; i < arr.length; i++) {
////            for (int j = i+1; j < arr.length; j++) {
////                if(arr[i] + arr[j] == target) {
////                    int[] a = {i, j};
////                    System.out.println(Arrays.toString(a));
////                }
////            }
////        }
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

}
