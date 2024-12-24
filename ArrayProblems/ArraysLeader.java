package ArrayProblems;

import java.util.ArrayList;

public class ArraysLeader {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(findLeader(arr));
    }

    static ArrayList<Integer> findLeader(int[] arr){
        ArrayList<Integer> list  = new ArrayList<>();

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
