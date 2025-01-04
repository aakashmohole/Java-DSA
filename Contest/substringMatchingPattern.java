package Contest;

public class substringMatchingPattern {
    public static void main(String[] args) {
        String  s = "car", p = "c*v";
        System.out.println(hasMatch(s, p));
    }
//    public static boolean hasMatch(String s, String p) {
//        for (int i = 0; i < p.length(); i++) {
//            StringBuilder st =  new StringBuilder("");
//            if (p.charAt(i) != '*') {
//                st.append(p.charAt(i));
//            }
//            if (s.contains(st)){
//                return true;
//            }
//        }
//        return false;
//    }

    public static boolean hasMatch(String s, String p) {
        // Replace '*' in the pattern with '.*' for regex matching
        String regex = p.replace("*", ".*");

        // Check if the pattern matches any substring of s
        return s.matches(".*" + regex + ".*");
    }
}
