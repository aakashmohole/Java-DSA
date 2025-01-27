package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class itrationHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // Iterate using Iterator
        Iterator it = cities.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();

        //Using For each
        for (String city : cities){
            System.out.println(city);
        }

    }
}
