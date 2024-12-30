package stringProblems;

public class printDuplicateCharactersInString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        printDuplicateCharacters(s);
    }
    public static void printDuplicateCharacters(String s) {
        // Create an array to count character frequencies (for 'a' to 'z')
        int[] count = new int[256]; // ASCII range

        // Count occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        // Print characters with count greater than 1
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + ", count = " + count[i]);
            }
        }
    }
}
