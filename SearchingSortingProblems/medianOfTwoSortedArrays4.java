package SearchingSortingProblems;

import java.util.Arrays;

public class medianOfTwoSortedArrays4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] temp = new int[n];


        for (int i = 0; i <nums1.length; i++) {
            temp[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            temp[nums1.length + i] = nums2[i];
        }

        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
        double median;
        if (n % 2 == 0){
            median = (temp[n / 2] + temp[n / 2 - 1]) / 2.0;
        }else {
            median = temp[n / 2];
        }
        return median;
    }
}
