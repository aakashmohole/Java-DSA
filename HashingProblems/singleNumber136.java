package HashingProblems;

import java.util.HashMap;

public class singleNumber136 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

        }
        for (int i = 0; i < nums.length ; i++) {
            if (map.get(nums[i]) == 1){
                return nums[i];
            }
        }
        return -1;
    }
}
