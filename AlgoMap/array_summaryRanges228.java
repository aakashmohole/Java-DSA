package AlgoMap;

import java.util.ArrayList;
import java.util.List;

public class array_summaryRanges228 {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            int start = nums[i];
            while (i+1 < size && nums[i+1] == nums[i] +1){
                i++;
            }
            if(start != nums[i]){
                result.add("" + start + "->" + nums[i]);
            }else {
                result.add(""+start);
            }
        }
        return result;
    }
}
