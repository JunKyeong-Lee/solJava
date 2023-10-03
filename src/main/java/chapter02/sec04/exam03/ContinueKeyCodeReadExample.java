package chapter02.sec04.exam03;

import java.io.IOException;

public class ContinueKeyCodeReadExample {
    public static void main(String[] args) throws IOException {
        int keyCode = 0;

        while (keyCode != '\n') {
            keyCode = System.in.read();
            System.out.println("keyCode = " + keyCode);
        }
    }
}
