package Practice;

import java.util.ArrayList;

public class findDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,2,3,6,2,3};
        System.out.println(findKthTime(arr));
    }
    static ArrayList<Integer> find(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    list.add(arr[i]);
                }
            }
        }

        return list;
    }
    static ArrayList<Integer> findKthTime(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();

        int k = 2;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count = count + 1;
                    if (count == k){
                        list.add(arr[i]);
                    }
                }

            }
        }

        return list;
    }
}
