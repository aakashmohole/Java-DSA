package stringProblems;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class reverseWordsInString151 {
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s) {
        String regex = "[,\\s]";
        String[] words = s.split(regex);
        ArrayList<String> list = new ArrayList<>();

        for (int i = words.length-1; i >= 0; i--) {
            if (!words[i].isEmpty()){
                list.add(words[i]);
            }
        }
//        Collections.reverse(list);
        return String.join(" ",list);
    }
}
