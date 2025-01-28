package HashingProblems;

import java.util.*;

public class MajorityElementII229 {
    public static void main(String[] args) {
        int[] arr= {3,2,3};
        System.out.println(majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        List<Integer> res = new ArrayList<>();
        for (Integer key : hm.keySet()){
            if (hm.get(key) > nums.length/3){
                res.add(key);
            }
        }
        return res;
    }
}
