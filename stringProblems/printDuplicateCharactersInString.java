package stringProblems;

import java.util.*;


public class printDuplicateCharactersInString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        printDuplicateCharacters(s);
    }
    public static void printDuplicateCharacters(String s) {
        HashMap<Character, Integer> map =  new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }


    }
}
