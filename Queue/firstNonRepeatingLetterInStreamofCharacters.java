package Queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class firstNonRepeatingLetterInStreamofCharacters {
    public static void printNonRepeating(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            q.add(c);
            map.put(c, map.getOrDefault(c, 0) +1);

            while (!q.isEmpty() && map.get(q.peek()) > 1){
                q.remove();
            }
            if (q.isEmpty()){
                System.out.print(-1 + " ");
            }else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
