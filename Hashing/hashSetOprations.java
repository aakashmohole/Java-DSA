package Hashing;

import java.util.HashSet;

public class hashSetOprations {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(2);

        System.out.println(set);

        set.remove(2);
        System.out.println(set);

        if(set.contains(2)){
            System.out.println("set contains 2");
        }else {
            System.out.println("set not contains 2");
        }

        System.out.println(set.size());

        set.clear();

        System.out.println(set.isEmpty());
    }
}
