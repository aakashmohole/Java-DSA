package Search;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,9,5,15,7,8};
        sortIt(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortIt(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if( arr[j] > arr[j+1]){
                    int tem = arr[j];
                    arr[j] =arr[j+1];
                    arr[j +1] = tem;
                }
            }


        }
    }
}
