package chapter03.sec02.exam05;

public class CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1; // 리터럴 간의 연산 단계에서는 괜찮다. 타입변환이 없음
        char c2 = 'A';
        // char c3 = c2 + 1; // 변수 연산이 포함되는 순간 일단 int로 바뀌기 때문에 오류
        char c4 = (char) (c2 + 1);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        // System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
    }
}
