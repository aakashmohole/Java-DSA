package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class findSubset {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
    static void findSubsets(String str, String ans, int i){
        //base condition
        if (i ==  str.length()){
            System.out.println(ans);
            return;
        }
        //yes condition
        findSubsets(str, ans+str.charAt(i), i+1);

        //no condition
        findSubsets(str, ans, i+1);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        addSubsets(nums, 0, list, new ArrayList<>());
        return list;
    }
    public static void addSubsets(int[] nums, int i, List<List<Integer>> ansList, ArrayList<Integer> subList){
        if(i == nums.length){
            ansList.add(new ArrayList<>(subList));
            return;
        }

        //Important logic is here for what take and what not to take.
        // yes
        subList.add(nums[i]);
        addSubsets(nums, i+1,ansList, subList);
        subList.remove(subList.size()-1);

        //no
        addSubsets(nums, i+1, ansList, subList);
    }
}
