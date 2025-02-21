package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset2 {
    public static void main(String[] args) {
        int arr[] = {1,2,2};
        System.out.println(subsets(arr));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        addSubset(0, nums, list, new ArrayList<>());
        return list;
    }
    public static void addSubset(int i, int[] nums, List<List<Integer>> ansList, List<Integer> subList){
        if (i == nums.length){
            ansList.add(new ArrayList<>(subList));
            return;
        }

        //for yes
        subList.add(nums[i]);
        addSubset(i+1, nums, ansList, subList);
        subList.remove(subList.size()-1);

        //we are skipping the duplicate values here
        // Skip duplicate elements
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }

        //for no
        addSubset(i+1, nums, ansList, subList);
    }

}
