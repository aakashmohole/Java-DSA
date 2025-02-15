package stringProblems;

/*



*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class longestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));

    }

    public static int longestSubstring(String s) {
        int start = 0, end = 0;
        int max_length = 0;
        List<Character> list = new ArrayList<>();

        while (end < s.length()){
            if (!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_length = Math.max(max_length, list.size());
            }
            else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
    }

}
