package chapter13.sec01.exam06;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        System.out.println("map.size() = " + map.size());

        System.out.println("\tmap.get(\"b\") = " + map.get("b"));
        System.out.println();

        var entrySet = map.entrySet();

        for (var x : entrySet) {
            System.out.println("x.getKey() = " + x.getKey());
            System.out.println("x.getValue() = " + x.getValue());
        }
        System.out.println();

        map.remove("a");
        System.out.println("map.size() = " + map.size());

        entrySet = map.entrySet();
        var entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }
        System.out.println();

        map.clear();
        System.out.println("map.size() = " + map.size());
    }
}
