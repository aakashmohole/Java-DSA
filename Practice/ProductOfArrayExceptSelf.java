package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    static ArrayList<Integer> find(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (arr[i+1] * arr[i + 2]);
            list.add(sum);
        }

        return list;
    }

        public static int[] productExceptSelf(int[] nums) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i!=j){
                        nums[i] = (nums[i] * nums[j]);
                    }
                }
            }
            return nums;
        }
}
