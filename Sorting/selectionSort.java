package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min] > arr[j]){
                    int t = arr[min];
                    arr[min]=arr[j];
                    arr[j] = t;
                }
            }

        }

    }

}
