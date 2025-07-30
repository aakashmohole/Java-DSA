package StackQueueProblems;

import java.util.Arrays;
import java.util.Stack;

public class previousSmallerElement {

    public static  int[] find(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(s.size() > 0 && s.peek() >= arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,0,8,6};
        System.out.println(Arrays.toString(find(arr)));
    }
}
