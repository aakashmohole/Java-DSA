package Practice;
;
import java.util.Arrays;

public class left_right_rotate {
    public static void main(String[] args) {
        int[] arr = {1,5,4,6,3};
        System.out.println(Arrays.toString(rotate(arr, 5)));
    }
    static int[] rotate(int[] arr, int n ){
        int tem = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = tem;
    return arr;
    }

}
