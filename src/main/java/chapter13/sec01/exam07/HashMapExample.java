package chapter13.sec01.exam07;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student(1, "a"), 95);
        map.put(new Student(1, "a"), 95);

        System.out.println("map.size() = " + map.size());

    }
}
