package stringProblems;

public class rotateString796 {
    public static void main(String[] args){
       String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String double_str = s + s;
        return double_str.contains(goal);
    }
}
