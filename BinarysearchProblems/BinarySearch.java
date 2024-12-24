package BinarysearchProblems;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int n = arr.length;;
        int low = 0 , high = arr.length-1;

        while(low <= high){
            int mid = (low +high) /2;
            if (arr[mid] ==  target){
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            }else {
                high = mid -1 ;
            }
        }
        return -1;
    }
}

