package chapter13.sec01.exam01;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a"); // a
        list.add("b"); // a b
        list.add("c"); // a b c
        list.add(2, "d"); // a b d c
        list.add("e"); // a b d c e

        int size = list.size(); // 5
        System.out.println("size = " + size);
        System.out.println();

        String alpha = list.get(2); // a b d c e
        System.out.println("2: " + alpha);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println("str[" + i + "] = " + str);
        }
        System.out.println();

        list.remove(2); // a b c e
        list.remove(2); // a b e
        list.remove("e"); // a b

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println("str[" + i + "] = " + str);
        }
    }
}
