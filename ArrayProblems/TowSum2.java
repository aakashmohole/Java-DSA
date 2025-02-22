package ArrayProblems;

import java.util.Arrays;
import java.util.HashMap;

public class TowSum2 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target  = 9;
        System.out.println(Arrays.toString(twoSumWithHashMap(arr, target)));
    }
    public static int[] twoSumWithHashMap(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0; i< nums.length; i++){
            int num = nums[i];
            int moreNeeded = target - num;
            if (map.containsKey(moreNeeded)){
                return new int[]{map.get(moreNeeded), i+1};
            }
            map.put(nums[i], i+1);
        }
        return new int[]{};
    }
}
