package stringProblems;

public class removeConsecutiveCharacters {
    public static void main(String[] args) {
        String s = "abcddcba";
        System.out.println(remove(s));
    }
    public static String remove(String s){
        StringBuilder sb =  new StringBuilder("");

//        sb.append( s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1  && s.charAt(i) == s.charAt(i+1)){
                i++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
