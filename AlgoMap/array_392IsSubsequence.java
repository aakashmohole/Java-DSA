package AlgoMap;

public class array_392IsSubsequence {
    public static void main(String[] args) {
       String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {

        String dup = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)){
                    dup = dup + t.charAt(j);
                    break;
                }
            }
        }
        if (dup.equals(s)){
            return true;
        }
        return false;
    }

}
