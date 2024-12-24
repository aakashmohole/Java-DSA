package Practice;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(find(arr));
    }

    static int find(int[] arr){
        int sum = 0;
        int max = arr[0];

        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];

            if (sum > max) {
                max = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
