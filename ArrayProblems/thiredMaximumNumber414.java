package ArrayProblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class thiredMaximumNumber414 {
    public static void main(String[] args) {
        int[] nums = {2,2, 3, 1};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;

            // Check if the current number is already in the list
            for (int j = 0; j < list.size(); j++) {
                if (nums[i] == list.get(j)) {
                    isUnique = false;
                    break;
                }
            }

            // Add the number to the list only if it's unique
            if (isUnique) {
                list.add(nums[i]);
            }
        }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        if(list.size() > 3){
            return list.get(2);
        }else{
            return list.get(0);
        }
    }
}
