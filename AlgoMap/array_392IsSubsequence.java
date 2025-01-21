package AlgoMap;

public class array_392IsSubsequence {
    public static void main(String[] args) {
       String s = "acb", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        //s = "acb", t = "ahbgdc"
        int j = 0;
        String dup = "";
        for (int i = 0; i < s.length(); i++) {
            while (j < t.length()){
                if (s.charAt(i) == t.charAt(j)){
                    dup = dup + t.charAt(j);
                    j++;
                    break;
                }
                j++;
            }
        }
        if (dup.equals(s)){
            return true;
        }
        return false;
    }

}
