package stringProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class groupAnagrams49 {
    public static void main(String[] args) {
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs1));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> sortedRepresentatives = new ArrayList<>();

        for (String str : strs) {
            // Sort the current string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            boolean isGrouped = false;

            // Check against the sorted representatives
            for (int i = 0; i < sortedRepresentatives.size(); i++) {
                if (sortedRepresentatives.get(i).equals(sortedStr)) {
                    result.get(i).add(str);
                    isGrouped = true;
                    break;
                }
            }

            // If no match found, create a new group
            if (!isGrouped) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(str);
                result.add(newGroup);
                sortedRepresentatives.add(sortedStr);
            }
        }

        return result;
    }
}
