package HashingProblems;

import java.util.*;

public class unionAndIntersection {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};

//        findUnion(arr1, arr2);
//        findIntersect(arr1, arr2);
        System.out.println(Arrays.toString(findIntersectList(arr1, arr2)));


    }
    public static void findUnion(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println(set);
//        return set.size();
    }

    public static void findIntersect(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(set.contains(arr2[i])){
                count++;
                System.out.print(arr2[i]);
                set.remove(arr2[i]);
            }
        }
//        return count;
    }
    public static int[] findIntersectList(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
    public static int[] findIntersectListWithHashMap(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                ans.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        // Convert List<Integer> to int[]
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}
