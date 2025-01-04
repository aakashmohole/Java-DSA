package stringProblems;

public class longestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        generateAllSubstrings(s);
    }

    public static void generateAllSubstrings(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) { // Outer loop for the start of the substring
            for (int j = i + 1; j <= n; j++) { // Inner loop for the end of the substring
                System.out.println(s.substring(i, j));
            }
        }
    }

}
