package Sorting;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        sort(arr,0,arr.length-1); //sorting is done here in original array
        System.out.println(Arrays.toString(arr)); //printed sorted arr
    }
    static void sort(int[] arr, int low, int hig){
        if(low > hig){
            return ;
        }

        int s = low;
        int e = hig;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s <= e){
                int tem = arr[s];
                arr[s] = arr[e];
                arr[e] = tem;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,hig);
    }
}
