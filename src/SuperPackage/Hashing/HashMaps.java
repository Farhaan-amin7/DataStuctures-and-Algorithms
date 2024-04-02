package SuperPackage.Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class HashMaps {
    public static void main(String[] args) {
        TreeMap<String, Integer >map = new TreeMap<>();
        map.put("Kunal", 99);
        map.put("Faizan", 87);
        map.put("Farhaan", 274);
        System.out.println(map.get("Faizan"));
        System.out.println(map.getOrDefault("whatever", 100));
        HashSet<Integer> set = new HashSet<>();
        set.add(546);
        set.add(656);
        set.add(5);
        set.add(56);
        set.add(999);
        set.add(5);
        set.add(46);
        System.out.println(set);
    }

}