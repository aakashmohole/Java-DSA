package RecursionProblems;


import java.lang.reflect.Array;
import java.util.Arrays;

public class pattern1 {
    public static void main(String[] args) {
        int[] arr = {7,4,5,1,2,3,6};
        selectionsort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    /*

     * * * * *
     * * * *
     * * *
     * *
     *

     */
    static void triangle (int r, int c){
        if(r == 0){
            return;
        }
        if (c < r){
            System.out.print("*");
            triangle(r, c+1);
        }else {
            System.out.println();
            triangle(r-1, 0);
        }
    }

    /*

    *
    * *
    * * *
    * * * *
    * * * * *

    */
    static void triangle1 (int r, int c){
        if(r == 0){
            return;
        }
        if (c < r){
            triangle1(r, c+1);
            System.out.print("*");
        }else {
            triangle1(r-1, 0);
            System.out.println();
        }
    }

    //SELECTION SORT

    static void selectionsort(int[] arr, int r, int c, int max){
        if (r==0){
            return;
        }
        if(c <r){
            if(arr[c] >  arr[max]){
                selectionsort(arr, r, c+1, c);
            }else {
                selectionsort(arr, r, c+1, max);
            }
        }else{
            int tem = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = tem;
            selectionsort(arr, r-1, 0,0);
        }

    }
}
