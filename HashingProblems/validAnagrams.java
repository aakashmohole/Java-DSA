package HashingProblems;

import java.util.HashMap;

public class validAnagrams {
    public static void main(String[] args) {
        String s = "care", t = "race";
        System.out.println(find(s, t));
    }
    public  static boolean find(String s, String t){

        if (s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (hm.get(t.charAt(i)) != null ){
                if (hm.get(t.charAt(i)) == 1){
                    hm.remove(t.charAt(i));
                }else {
                    hm.put(t.charAt(i), hm.get(t.charAt(i)) -1);
                }
            }else {
                return false;
            }
        }
        return hm.isEmpty();
    }

}
