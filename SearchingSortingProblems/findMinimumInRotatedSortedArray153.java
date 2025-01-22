package SearchingSortingProblems;

public class findMinimumInRotatedSortedArray153 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int ans = Integer.MIN_VALUE;
        while (left < right){
            int mid = left + (right - left) / 2;

            if (nums[mid] <  nums[right]){
                right = mid;
            }else {
                left = mid +1;
            }
        }
        return nums[left];
    }
}
