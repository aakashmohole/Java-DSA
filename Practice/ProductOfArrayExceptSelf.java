package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {10,3,5,6,2};
        System.out.println(find(arr));
    }
    static ArrayList<Integer> find(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (arr[i+1] * arr[i + 2]);
            list.add(sum);
        }

        return list;
    }
}
