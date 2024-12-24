package RecursionProblems;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,8,6};
        findAllInd1(arr,4, 0);
//        System.out.println(findAllInd(arr,4, 0));
    }
    static boolean find(int[] arr, int target, int ind){
        if(ind == arr.length){
            return false;
        }
        return arr[ind] == target || find(arr, target, ind+1);
    }

    //return index value
    static int findInd(int[] arr, int target, int ind){
        if(ind == arr.length){
            return -1;
        }
        if (arr[ind] == target){
            return ind;
        }
        else {
            return findInd(arr, target, ind+1);
        }
    }

    //store index of target in list
    static ArrayList<Integer> findAllInd(int[] arr, int target, int ind){
        ArrayList<Integer> list = new ArrayList<>();
        if (ind == arr.length){
            return list;
        }
        if (arr[ind] == target){
            list.add(ind);
        }
        ArrayList<Integer> ansFromBelow = findAllInd(arr, target, ind);
        list.addAll(ansFromBelow);
        return list;
//        findAllInd(arr, target, ind+1);
    }

    static ArrayList<Integer> list1 = new ArrayList<>();
    static void findAllInd1(int[] arr, int target, int ind){
        if (ind == arr.length){
            return;
        }
        if (arr[ind] == target){
            list1.add(ind);
        }
        findAllInd(arr, target, ind+1);
    }

}
