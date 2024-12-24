package Search;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8};
        int target = 4;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

static int binarySearch(int[] arr,int target){
    int start=0;
    int end = arr.length-1;

    //first way to find the mid
    //int mid= start+end/2;

    while (start <= end){
        // Second way to find the mid used in long range int values
        int mid = start + (end-start)/2;
        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            return mid;
        }
    }
    return -1;

    }
}
