package chapter10.sec02.exam02;

public class TryCatchFinallyRuntimeExceptionExample {
    public static void main(String[] args) {
        String data1, data2;
        String[] temp = {"1", "2a"};

        try {
            data1 = temp[0];
            data2 = temp[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값 수가 부족합니다.");
            return;
        }

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + " + " + data2 + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } finally {
            System.out.println("다시 실행하세요.");
        }
    }
}
