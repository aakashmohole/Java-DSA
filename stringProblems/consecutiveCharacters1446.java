package stringProblems;

public class consecutiveCharacters1446 {
    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        System.out.println(find(s));
    }
    public static int find(String s){
        int count = 1, maxpow = 1;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count = count+1;
                if (count > maxpow){
                    maxpow = count;
                }
            }else {
                count = 1;
            }

        }
        return maxpow;
    }
}
