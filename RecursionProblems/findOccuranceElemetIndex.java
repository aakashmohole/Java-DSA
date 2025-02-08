package RecursionProblems;

import java.util.ArrayList;

/*
 arr = {3,2,4,5,6,2,1,8,9,2} key = 2
 ans = 1,5,9
 */
public class findOccuranceElemetIndex {
    public static void main(String[] args) {
        int[]  arr = {3,2,4,5,6,2,1,8,9,2};
        int key = 2;
        System.out.println(lastOccurence(arr, 0, key));
    }

    public static int firstOccurence(int[] arr, int i, int key){
        if(i == arr.length){
            return  -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, i+1, key);
    }

    public static int lastOccurence(int[] arr, int i, int key){
        if(i == arr.length){
            return  -1;
        }
        int isFound = lastOccurence(arr, i+1, key);
        if (isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }


    public static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> find(int[] arr, int i, int key){

        if(i == arr.length){
            return list;
        }
        if(arr[i] == key){
            list.add(i);
        }
        find(arr, i+1, key);
        return list;
    }
}
