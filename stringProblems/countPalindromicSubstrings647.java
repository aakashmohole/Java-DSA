package stringProblems;

public class countPalindromicSubstrings647 {
    public static void main(String[] args) {
        String s ="aaa";
        System.out.println(find(s));
    }
    public static int find(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrom(s, i, j) == true){
                   count = count+1;
                }
            }
        }
        return count;
    }
    public static boolean isPalindrom(String s, int i, int j){
        while (i < j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if (ch1 != ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
