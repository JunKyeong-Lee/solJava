package chapter13.sec01.exam04;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("a"); // a
        set.add("b"); // b a
        set.add("c"); // c b a
        set.add("a"); // c b a
        set.add("d"); // c b a d

        int size = set.size();
        System.out.println("size = " + size);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set.remove("a"); // c b d
        set.remove("c"); // b d

        System.out.println("set.size() = " + set.size());

        for (var element : set) {
            System.out.println("\t" + element);
        }

        set.clear();
        System.out.println("(set.isEmpty()) = " + (set.isEmpty()));
    }
}
