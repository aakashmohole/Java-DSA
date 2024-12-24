package ArrayProblems;

import java.util.Arrays;

public class moveZeroToend {
    public static void main(String[] args) {
        int[]nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int j = -1;

        for(int i = 0; i <nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        for(int i = j+1; i<nums.length; i++){
            if(nums[i] != 0){
                swap(nums[i], nums[j]);
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
    public static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
}
