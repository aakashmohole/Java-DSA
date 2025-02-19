package neetCode;


public class arrays_2239 {
    public static void main(String[] args) {
        int[] arr= {-100000,-100000};
        System.out.println(returnNearestNo(arr));
    }
    public static int returnNearestNo(int[] nums){
        int closest =Integer.MAX_VALUE;
        int val = 0;
        for (int i = 0; i < nums.length; i++) {
            val = Math.abs(nums[i] - 0);
            if (val < Math.abs(closest)){
                closest = nums[i];
            }else if (val == Math.abs(closest) && (nums[i] > closest)) {
                closest = nums[i];
            }
        }

        return closest;
    }
}
