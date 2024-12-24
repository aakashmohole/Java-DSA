package Practice;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        System.out.println(find(arr,6));
    }
    static int find(int[] arr, int n){

        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return totalSum - sum;
    }

}
