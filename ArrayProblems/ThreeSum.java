package ArrayProblems;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSumOptimal(arr));
    }

    //brut force
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        if (!set.contains(triplet)) {
                            set.add(triplet);
                            ansList.add(triplet);
                        }
                    }
                }
            }
        }

        return ansList;
    }
    //Better Apporach
    public static List<List<Integer>> threeSumBetter(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            int target = -nums[i];
            HashSet<Integer> s = new HashSet<>();

            for (int j = i+1; j < nums.length-1; j++) {
                int third = target - nums[j];

                if (s.contains(third)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(triplet);
                    set.add(triplet);
                }
                //seen value
                s.add(nums[j]);
            }

        }
        List<List<Integer>> ansList = new ArrayList<>(set); // Convert HashSet to List
        return ansList;
    }

    public static List<List<Integer>> threeSumOptimal(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // if duplicate found increment
            if (i>0 && nums[i] == nums[i-1]) continue;

            int j = i+1, k = nums.length-1;

            while(j < k){
              int sum = nums[i] + nums[j] + nums[k];
              if (sum > 0) {
                  k--;
              }else if (sum < 0) {
                  j++;
              }else {
                  ansList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                  j++;
                  k--;

                  while (j < k && nums[j] == nums[j-1]) j++;
              }

            }

        }
        return ansList;
    }
}
