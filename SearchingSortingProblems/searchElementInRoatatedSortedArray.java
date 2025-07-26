package SearchingSortingProblems;

public class searchElementInRoatatedSortedArray {

    public static int searchIt(int[] arr, int target) {
        int mid;
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == target) return mid;

            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(searchIt(arr, target));  // Output: 4
    }
}
