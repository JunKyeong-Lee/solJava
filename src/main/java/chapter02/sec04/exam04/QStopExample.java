package chapter02.sec04.exam04;

import java.util.Scanner;

public class QStopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputData;

        while (true) {
            inputData = scanner.nextLine();
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            if (inputData.equals("q")) {
                break;
            }
        }
        System.out.println("종료");
    }
}
