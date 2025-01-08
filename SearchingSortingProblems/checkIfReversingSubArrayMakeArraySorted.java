package SearchingSortingProblems;

import java.util.Arrays;

public class checkIfReversingSubArrayMakeArraySorted {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 4, 3};
        int n = arr.length;

        if (checkReverse(arr, n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
    public static boolean checkReverse(int[] arr, int n){
        int[] temp = new int[n];

        // Copying the array
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        // Sort the copied array.
        Arrays.sort(temp);

        // Finding the first mismatch.
        int front;
        for (front = 0; front < n; front++) {
            if (temp[front] != arr[front]){
                break;
            }
        }

        // Finding the last mismatch
        int last;
        for (last = n-1; last >= 0 ; last--) {
            if (temp[last] != arr[last]) {
                break;
            }
        }

        // If whole array is sorted
        if (front >= last){
            return true;
        }

        // Checking sub array is decreasing or not.
        do {
            front++;
            if (arr[front - 1] < arr[front]){
                return false;
            }
        }while (front != last);

        return true;
    }
}
