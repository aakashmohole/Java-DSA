package ArrayProblems;

import java.util.*;

public class leadersInArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 0};
        System.out.println(leaders(arr));
    }
    public static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]){
                    leader = false;
                    break;
                }
            }
            if (leader){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
