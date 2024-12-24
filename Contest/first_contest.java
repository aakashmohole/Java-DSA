package Contest;

import java.util.ArrayList;

public class first_contest {
    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 14};
        System.out.println(findList(arr));

    }
    static int find(int[] arr){
        int minimumElement = Integer.MAX_VALUE;
        int dig = 0;
        int rem = 0;
        int var = 0;
        for (int i = 0; i < arr.length; i++) {
            dig = arr[i]/10;
            rem =arr[i] % 10;
            var = dig + rem;
            if (minimumElement  > var){
                minimumElement = var;
            }
        }
        return minimumElement;
    }

    static ArrayList<Integer> findList(int[] arr){
        int dig = 0;
        int rem = 0;
        int var = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            dig = arr[i]/10;
            rem =arr[i] % 10;
            var = dig + rem;
            list.add(var);
        }
        return list;
    }
}
