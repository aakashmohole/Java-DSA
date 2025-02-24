package ArrayProblems;

public class containerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {1,7,2,5,4,7,3,6};
        System.out.println(maxAreaTowPointer(heights));
    }

    // BF Approach O(n^2)
    public static int maxArea(int[] heights) {
        int max_w = 0;
        for(int i =0; i<heights.length-1; i++){
            for(int j = i+1; j< heights.length; j++){
                int width = j-i;
                int height = Math.min(heights[i], heights[j]);
                int area = width * height;
                max_w = Math.max(area, max_w);
            }
        }
        return max_w;
    }

    // Tow Pointer Approach
    public static int maxAreaTowPointer(int[] heights) {
        int left = 0, right = heights.length-1, max_water = 0;
        while (left < right) {

            int width = right - left;
            int ht = Math.min(heights[left], heights[right]);
            int area = width * ht;

            max_water = Math.max(area, max_water);

            // Move the smaller height pointer
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max_water;

    }
}
