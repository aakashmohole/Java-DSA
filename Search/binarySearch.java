package Search;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8};
        int target = 4;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

static int binarySearch(int[] arr,int target){
    // variable
    int start = 0, end = arr.length-1;
    int mid;

    while(start <= end){
        // find mid
        mid = start + (end - start) / 2;


        //condition
        if (target < arr[mid]){
            end = mid -1;
        }else if(target > arr[mid]){
            start = mid + 1;
        }else {
            return mid;
        }
    }
    //return
    return -1;
}
}
