package ArrayProblems;

import java.util.Arrays;

public class leftRotateArrayByOnePlace {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);

    }
    public static void rotate(int[] nums, int k) {
        int fromIndex = 0;
        int toIndex = k;

        int newLength = toIndex - fromIndex;
        int[] temp = new int[newLength];

        // Copy the elements manually using a for loop
        for (int i = 0; i < newLength; i++) {
            temp[i] = nums[fromIndex + i];
        }
        System.out.println(Arrays.toString(temp));

        for(int i=k; i<nums.length; i++){
            nums[i-k] = nums[i];
        }
        for(int i = nums.length-k; i <nums.length; i++){
            nums[i] = temp[i - (nums.length-k)];
        }
        System.out.println(Arrays.toString(nums));
    }
}

