package AlgoMap;

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.Math.abs;

public class arrays_2239 {
    public static void main(String[] args) {
        int[] arr= {2,-1,1};
        System.out.println(returnNearestNo(arr));
    }
    public static int returnNearestNo(int[] nums){
//        int dis = Integer.MIN_VALUE;
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            dis = abs(nums[i] - 0);
//            list.add(dis);
//            Collections.sort(list);
//        }
//        ArrayList<Integer> occ_list = new ArrayList<>();
//        for (int j = 0; j < list.size(); j++) {
//            if(Math.abs(list.get(j) - 0) == list.get(0)){
//                occ_list.add(list.get(j));
//            }
//        }
//        int max = 0;
//        for (int i = 0; i < occ_list.size(); i++) {
//            if (occ_list.get(i) > max){
//                max= occ_list.get(i);
//                return max;
//            }
//        }
//        return -1;

        int closest = nums[0]; // Start with the first element as the closest

        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(closest)) {
                closest = nums[i]; // Update if a closer number is found
            } else if (Math.abs(nums[i]) == Math.abs(closest) && nums[i] > closest) {
                closest = nums[i]; // Prefer positive number in case of tie
            }
        }

        return closest;
    }
}
