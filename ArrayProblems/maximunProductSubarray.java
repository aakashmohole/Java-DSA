package ArrayProblems;

public class maximunProductSubarray {
    public static void main(String[] args) {
        int[] arr = {-4, -3};
        int ans = find(arr);
        System.out.println(ans);
    }

    public static int find(int[] arr) {

        int maxprod = Integer.MIN_VALUE;;
        int sum = 0;

        // If the array has only one element, return that element
        if (arr.length == 1) {
            return arr[0];
        }

//        if (arr.length == 0) {
//            maxprod = arr[0];
//            return maxprod;
//        }
        for (int i = 0; i < arr.length - 1; i++) {
            sum = sum + (arr[i] * arr[i + 1]);
            if (sum > maxprod) {
                maxprod = sum;
            }
            if (sum < maxprod || sum == maxprod) {
                sum = 0;
            }
        }
        return maxprod;
    }
}
