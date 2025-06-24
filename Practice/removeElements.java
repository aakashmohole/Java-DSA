package Practice;

public class removeElements {
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        System.out.println(removeElement(arr, 3));
    }
    public static int removeElement(int[] nums, int val) {
        int k = 0;  // Points to the next position to keep
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // Copy the element
                k++;
            }
        }
        return k;  // k is the new length
    }
}
