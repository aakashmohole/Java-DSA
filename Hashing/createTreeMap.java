package Hashing;

import java.util.LinkedHashMap;
import java.util.TreeMap;

//Sorted order of keys
public class createTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> thm = new TreeMap<>();
        thm.put("India", 100);
        thm.put("China", 150);
        thm.put("Us", 50);

        System.out.println(thm);
    }
}
