package stringProblems;

public class longestRepeatingCharacterReplacement424 {
    public static void main(String[] args) {
        String  s = "AABABBA"; int k = 1;
        System.out.println(returnCharacterReplacement(s, k));
    }
    public static int returnCharacterReplacement(String s, int k){
        int start =0, i = 0;
        String ans = "";
        while (i < s.length()){

            if (s.charAt(start) == s.charAt(i)){
                ans = ans+s.charAt(i);
                i++;
            }else {
                ans = ans+s.charAt(start);
                k = k-1;
                i++;
            }

        }
        return ans.length();
    }
}
