package chapter03.sec02.exam04;

public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;
        int result1 = v1 + v2;
        System.out.println("result1 = " + result1);

        int result4 = v1 / v2;
        System.out.println("int 끼리 나누기 -> 음수일 경우 완전히 몫은 아님");
        System.out.println("result4 = " + result4);

        int result5 = v1 % v2;
        System.out.println("나머지");
        System.out.println("result5 = " + result5);

        double result6 = 1.0 * v1 / v2;
        System.out.println("int 끼리 나누기 -> " +
                "소수점 아래도 잘 연산되게 double 변환");
        System.out.println("result6 = " + result6);
    }
}
