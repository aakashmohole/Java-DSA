package AlgoMap;


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




//        int closest = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if (Math.abs(nums[i]) < Math.abs(closest)) {
//                closest = nums[i]; // Update if a closer number is found
//            } else if (Math.abs(nums[i]) == Math.abs(closest) && nums[i] > closest) {
//                closest = nums[i]; // Prefer positive number in case of tie
//            }
//        }

        return closest;
    }
}
