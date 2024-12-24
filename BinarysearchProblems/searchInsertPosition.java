package BinarysearchProblems;

public class searchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int x = 1;
        int ans = search(arr, x);
        System.out.println("The element position is the index: " + ans);

    }
    static int search(int[] arr, int x){
        int low = 0, high = arr.length-1;
        int ans = 0;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }
            else {
                low =  mid + 1;
            }
        }
        return ans;
    }
}
