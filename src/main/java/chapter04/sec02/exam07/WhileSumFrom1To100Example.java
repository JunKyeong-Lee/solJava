package chapter04.sec02.exam07;

public class WhileSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;

        while (i <= 100) {
            sum += i;
            i++; // 조건이 변화되는 값이 있어야 된다.
        }

        System.out.println("1~" + (i - 1) + " 합 : " + sum);
    }
}
