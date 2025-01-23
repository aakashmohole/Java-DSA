package Hashing;

import java.util.*;

public class itrationHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India",100);
        hm.put("China",150);
        hm.put("Indonesia",50);
        hm.put("US",200);
        hm.put("Nepal",10);

        //Iteration
        Set<String> keys = hm.keySet();

        //loop
        for(String k : keys){
            System.out.println("Key="+k+", value="+ hm.get(k));
        }
    }
}
