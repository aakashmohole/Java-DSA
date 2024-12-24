package Sorting;

import java.util.Arrays;

public class selectionSort2 {
    public static void main(String[] args) {
        int[] arr = {5,6,4,7,3,1,2};
        System.out.println(Arrays.toString(selectionsort(arr)));
    }
    static int[] selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, max, last);
        }
        return arr;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
