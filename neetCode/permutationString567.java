package neetCode;

import java.util.HashMap;

public class permutationString567 {
    public static void main(String[] args) {
        String str = "ab";
        System.out.println(checkInclusion(str, "eidbaooo"));
    }
    public static boolean findPermutation(String s1, String ans, String s2){
        //base case
        if (s2.contains(ans)){
            return true;
        }


        //recursion
        for (int i = 0; i < s1.length(); i++) {
            char curr = s1.charAt(i);

            //"abc" => "bc" ---> substring(0,i) + substring(i+1)
            String newStr = s1.substring(0, i) + s1.substring(i+1);
            findPermutation(newStr, ans+curr, s2);
        }
        return false;
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> s2Map = new HashMap<>();

        for(char c : s1.toCharArray()){
            s1Map.put(c, s1Map.getOrDefault(c, 0) +1);
        }

        int window = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            char curr = s2.charAt(i);
            s2Map.put(curr, s2Map.getOrDefault(curr, 0) + 1);

            // If window size exceeds, remove the leftmost character
            if(i >= window){
                char left = s2.charAt(i - window);
                if (s2Map.get(left) == 1) {
                    s2Map.remove(left);
                } else {
                    s2Map.put(left, s2Map.get(left) - 1);
                }
            }
            // Compare both maps
            if (s1Map.equals(s2Map)) return true;
        }
        return false;
    }
}
