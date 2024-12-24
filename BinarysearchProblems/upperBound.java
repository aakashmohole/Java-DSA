package BinarysearchProblems;

public class upperBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int n = 4, x = 2;
        int ans = upperbound(arr, n, x);
        System.out.println("The upper bound is the index: " + ans);
    }

    static int upperbound(int[] arr, int n, int x){
        int low = 0, high = n-1;
        int ans = n;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > x){
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
