package neetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class topKFrequentElements347 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(arr,2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int[] res={};

        for (int key : map.keySet()){
            res = new int[]{key};
            k=k-1;
            if (k==0){
                break;
            }
        }
        return res;
    }
}
