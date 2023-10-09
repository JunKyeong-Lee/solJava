package chapter13.sec01.exam03;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린 시간:  " + (endTime - startTime) + "ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린 시간: " + (endTime - startTime) + "ns");
    }
}
