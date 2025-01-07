package SearchingSortingProblems;

public class countTripletsSumSmallerThanGivenValue {
    public static void main(String[] args) {
        int arr[] = {-2, 0, 1, 3};
        int sum = 2;
        System.out.println(findTripletsSum(arr, sum));
    }
    public static int findTripletsSum(int[] arr, int sum){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] < sum){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
