package ArrayProblems;

import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,5,6};
        int m=3, n=3;
        merge(n1,m, n2,n);
        System.out.println(Arrays.toString(n1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int ind = m+n-1, i = m-1, j = n-1;
        while (j >= 0 && i >= 0){
            if (nums1[i] >= nums2[j]){
                nums1[ind] = nums1[i];
                ind--;i--;
            }else {
                nums1[ind] = nums2[j];
                ind--;j--;
            }
        }
        while (j >= 0){
            nums1[ind] = nums2[j];
            ind--;j--;
        }
    }
}
