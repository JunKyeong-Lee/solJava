package chapter13.sec01.exam02;

import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        list.add(new Board("제목1", "내용1", "글쓴이1")); // 1
        list.add(new Board("제목2", "내용2", "글쓴이2")); // 1 2
        list.add(new Board("제목3", "내용3", "글쓴이3")); // 1 2 3
        list.add(new Board("제목4", "내용4", "글쓴이4")); // 1 2 3 4

        list.remove(1); // 1 3 4
        list.remove(2); // 1 3

        for (var x : list) {
            System.out.printf("%s, %s, %s\n", x.content, x.subject, x.writer);
        }
    }
}
