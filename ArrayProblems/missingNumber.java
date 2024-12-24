package ArrayProblems;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(find(arr));
    }

    public static int find(int[] arr){
        int n = arr.length;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return totalSum - sum;
    }
}

/*
We know that the summation of the first N numbers is (N*(N+1))/2.
We can say this S1. Now, in the given array, every number between 1 to N except one number is present.
So, if we add the numbers of the array (say S2), the difference between S1 and S2 will be the missing number.
Because, while adding all the numbers of the array, we did not add that particular number that is missing.
ex-

Sum of first N numbers(S1) = (N*(N+1))/2
Sum of all array elements(S2) = i = 0n-2a[i]
The missing number = S1-S2
 */