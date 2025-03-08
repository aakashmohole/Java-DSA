package Backtracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 8;
        System.out.println(combinationSumFind(arr, target));
    }

    public static List<List<Integer>> combinationSumFind(int[] candidates, int target) {
        List<List<Integer>> ansCombination = new ArrayList<>();

        Arrays.sort(candidates); // Sort to handle duplicate elements

        getAllCombinations(candidates, 0, new ArrayList<>(), ansCombination, target);
        return ansCombination;
    }

    public static void getAllCombinations(int[] arr, int i, List<Integer> combination, List<List<Integer>> ansCombination, int target) {
        if (target == 0) {
            ansCombination.add(new ArrayList<>(combination)); // Store a copy
            return;
        }

        for (int j = i; j < arr.length; j++) {
            if (j > i && arr[j] == arr[j - 1]) continue; // Skip duplicate numbers

            if (arr[j] > target) break; // Stop if the number exceeds the target

            combination.add(arr[j]);

            // Recursive call with the same i to allow multiple uses of the same element
            getAllCombinations(arr, j, combination, ansCombination, target - arr[j]);

            // Backtrack: Remove last added element
            combination.remove(combination.size() - 1);
        }
    }
}
