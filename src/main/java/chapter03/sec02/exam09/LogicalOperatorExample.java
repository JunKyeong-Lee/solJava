package chapter03.sec02.exam09;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        char charCode = 'A';
        if ((charCode >= 'A') && (charCode <= 'Z')) {
            System.out.println("대문자");
        }
        if ((charCode >= 'a') && (charCode <= 'z')) {
            System.out.println("소문자");
        }
        if ((charCode >= '0') && (charCode <= '9')) {
            System.out.println("0~9");
        }

        int value = 6;
        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2또는 3의 배수");
        }
    }
}
