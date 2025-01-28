package HashingProblems;
import java.util.*;
public class majorityElements169 {
    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        //create hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

//            if (hm.containsKey(nums[i])){
//                hm.put(nums[i], hm.get(nums[i]) + 1);
//            }else {
//                hm.put(nums[i], 1);
//            }

            //optimal
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }

        //get all keys
        for(Integer key : hm.keySet()){
            if (hm.get(key) > nums.length/3){
                return key;
            }
        }
        return -1;
    }
}
