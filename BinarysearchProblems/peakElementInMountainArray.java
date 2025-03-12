package BinarysearchProblems;

public class peakElementInMountainArray {
    public static void main(String[] args) {
        int[] A = {0,3,8,9,5,2};
        System.out.println(peakIndex(A));
    }
    public static int peakIndex(int[] arr){
        int start = 1, end = arr.length-2; // peak element never at 0 and n-1 index
        while (start <= end){
            int mid = start + (end-start) /2;

            if(arr[mid -1] < arr[mid] && arr[mid] > arr[mid+1]){
                return mid;
            } else if (arr[mid-1] < arr[mid]) { //right
                start = mid+1;
            }else { //left
                end = mid-1;
            }
        }
        return -1;
    }

}
