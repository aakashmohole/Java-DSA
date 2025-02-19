package stringProblems;

import java.util.*;

public class groupAnagrams49 {
    public static void main(String[] args) {
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagramsHashMap(strs1));
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
    public static List<List<String>> groupAnagramsHashMap(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];

            //convert string to char array to sort this string
            char[] ca = s.toCharArray();

            // sort char
            Arrays.sort(ca);

            //convert char array to string as key
            String key = String.valueOf(ca);

            //add values to hashmap
            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
