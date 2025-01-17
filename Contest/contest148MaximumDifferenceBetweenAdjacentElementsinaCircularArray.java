package Contest;

import java.util.ArrayList;
import java.util.Collections;

public class contest148MaximumDifferenceBetweenAdjacentElementsinaCircularArray {
    public static void main(String[] args) {
        int[] arr = {-5, -10, -5};
        System.out.println(maxAdjacentDistance(arr));
    }
    public static int maxAdjacentDistance(int[] nums) {
        int maxDif = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int next = (i +1) %nums.length;
            int def = Math.abs(nums[i] - nums[next]);
            maxDif = Math.max(maxDif, def);
        }
        return maxDif;
    }

}
