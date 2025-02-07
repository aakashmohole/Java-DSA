package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class arrangeNumbersFormBiggestNumber {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 5, 9};
        System.out.println(findLargestWithCollections(arr));
    }
    public static String findLargest(int[] arr) {
        String num = "";
        int max = Integer.MIN_VALUE;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(String.valueOf(arr[i]));
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                num = list.get(i) + list.get(j);
            }
            max = Math.max(max, Integer.parseInt(num));
        }
        return  Integer.toString(max);
    }

    public static String findLargestWithCollections(int[] arr) {
        // Convert numbers to strings
        ArrayList<String> list = new ArrayList<>();
        for (int num : arr) {
            list.add(String.valueOf(num));
        }

        // Custom comparator to sort numbers in a way that forms the largest number
        Collections.sort(list, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: If the largest number is "0", return "0" (e.g., [0, 0, 0])
        if (list.get(0).equals("0")) {
            return "0";
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (String num : list) {
            result.append(num);
        }
        return result.toString();
    }
}
