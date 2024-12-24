package ArrayProblems;

import java.util.Arrays;

public class LongestConsecutiveSequenceInArray {
    public static void main(String[] args) {
        int[] arr ={102,4,100,1,101,3,2,1,1};
        System.out.println(longestSuccessiveElements(arr));
    }

    //Brute Force Approach
    static boolean linearSerch(int[] arr, int n){
        int length = arr.length;;
        for (int i = 0; i < length; i++) {
            if (arr[i] == n){
                return true;
            }
        }
        return false;
    }
    static int find(int[] arr){
        int longest = 1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int cont = 1;

            //search for consecutive numbers
            while (linearSerch(arr, x + 1) == true) {
                x = x+1;
                cont= cont+1;
            }
            longest = Math.max(longest, cont);
        }
        return longest;
    }

    //Better Solution
    public static int longestSuccessiveElements(int []a) {
        int n = a.length;
        if (n == 0) return 0;

        //sort the array:

        Arrays.sort(a);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        //find longest sequence:
        for (int i = 0; i < n; i++) {
            if (a[i] - 1 == lastSmaller) {
                //a[i] is the next element of the
                //current sequence.
                cnt += 1;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = a[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}
