package stringProblems;


//STEPS TO SOLVE THIS PROBLEM
/*
* 1. check length of those two strings if not equal then they are not anagram
* 2. Create array to count frequency of each character present in string
* 3. check if count of frequency is zero the anagram
* */


public class validAnagram {
    public static void main(String[] args) {
        String s = "anagram", t= "nagaram";
        System.out.println(find(s, t));
    }

    public  static boolean find(String s, String t){
        // Check if lengths are different
        if (s.length() != t.length()){
            return false;
        }

        // Create an array to count character frequencies
        int[] count = new int[26];

        // Count characters in 's' and 't'
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)- 'a']++;
            count[t.charAt(i)- 'a']--;
        }
        // Check if all counts are zero
        for(int c : count){
            if (c != 0){
                return false;
            }
        }
        return true;
    }
}
