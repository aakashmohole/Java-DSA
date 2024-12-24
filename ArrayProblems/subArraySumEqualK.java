package ArrayProblems;

public class subArraySumEqualK {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(find(arr,3));
    }
//    [1,2,3], k = 3
    public static int find(int[] nums, int k){
        int c = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int s = 0;
            for (int j =i; j<n; j++){
                s = s + nums[j];
                if(s == k){
                    c +=1;
                }
            }
        }return c;
    }
}
