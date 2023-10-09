package chapter13.sec02.exam02;

import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            queue.offer(i + 1);
            System.out.println(i + 1 + "을(를) 큐에 넣었음");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "번째 queue.poll() = " + queue.poll());
        }
    }
}
