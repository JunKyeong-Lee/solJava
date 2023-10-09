package chapter13.sec01.exam05;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("a", 123));
        set.add(new Member("c", 444));

        System.out.println("set.size() = " + set.size());
        for (var x : set) {
            System.out.println("x.hashCode() = " + x.hashCode());
        }
    }
}
