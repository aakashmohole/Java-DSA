package Sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        sort(arr);
    }

    public static void sort(int[] arr){
        for (int i =1; i< arr.length; i++){
            int currentElement = arr[i];
            int preElement = i-1;
            while(preElement >= 0 && arr[preElement] > currentElement){
                arr[preElement + 1] = arr[preElement];
                preElement --;
            }
            arr[preElement +1] = currentElement;
        }
        System.out.println(Arrays.toString(arr));
    }
}
