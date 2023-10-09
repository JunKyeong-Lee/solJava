package chapter11.sec01.exam11;

import java.io.IOException;

public class KeyboardToStringExample {
    public static void main(String[] args) {
        byte[] bytes = new byte[100];

        System.out.print("입력: ");
        try {
            int readByteNo = System.in.read(bytes); // 고전적인 키보드 입력 받는 방법
            String str = new String(bytes, 0, readByteNo - 2);
            System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
