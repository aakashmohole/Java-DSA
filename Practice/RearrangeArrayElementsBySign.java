package Practice;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(arrange(arr)));
    }
    static int[] arrange(int[] arr){
        int p = 0;
        int n = 1;
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                ans[n] = arr[i];
                n = n+2;
            }else {
                ans[p] = arr[i];
                p = p+2;
            }
        }
        return ans;
    }
}
