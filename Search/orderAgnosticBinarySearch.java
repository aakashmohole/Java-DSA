package Search;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18,-7,2,4,8,6,77,88,99,120,145,156};
        int target = 77;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start=0;
        int end = arr.length - 1;

        //find wheather the arr is sorted in ascending or descending oreder.
        boolean isAsc = arr[start] < arr[end];
        System.out.println(isAsc);
        while(start <= end){

            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(arr[mid] < target){
                    start = mid +1;
                } else {
                    end = mid -1;
                }
            }else {
                if(arr[mid] > target){
                    start = mid +1;
                } else {
                    end = mid -1;
                }
            }

        }
        return -1;

    }
}
