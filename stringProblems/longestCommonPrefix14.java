package stringProblems;
/*
1. We have to sort this given array
2. We check for only first and last elements in array
3. Compare characters of first and last elements and break loop if character is not match
4. return the substring 0 to i
*/

import java.util.Arrays;

public class longestCommonPrefix14 {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(returnPrefix(str));
    }

    public static String returnPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }

        Arrays.sort(str); // Step 1: Sort the array
        String s1 = str[0]; // First string after sorting
        String s2 = str[str.length - 1]; // Last string after sorting

        int i = 0;
        // Compare characters of s1 and s2
        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) == s2.charAt(i)) {
                i++;
            } else {
                break;
            }
        }

        // Return the common prefix
        return s1.substring(0, i);

    }
}
