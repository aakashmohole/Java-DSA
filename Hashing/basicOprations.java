package Hashing;

import java.util.HashMap;

public class basicOprations {
    public static void main(String[] arg){
        //create hash
        HashMap<String, Integer> hm = new HashMap<>();

        //insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //Get - O(1)
        int ind_population = hm.get("India");
        System.out.println(ind_population);

        // not available value -- null
        System.out.println(hm.get("Russia"));

        //containsKey - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Russia"));

        //Remove
        System.out.println(hm.remove("China")); //return removed value also
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());
        
        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }

}
