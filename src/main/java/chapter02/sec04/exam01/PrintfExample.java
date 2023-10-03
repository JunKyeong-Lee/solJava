package chapter02.sec04.exam01;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("%d\n", value); // 기본
        System.out.printf("%6d\n", value); // 6개. 왼쪽이 빈곳, 오른쪽이 숫자
        System.out.printf("%-6d\n", value); // 6개. 왼쪽이 숫자, 오른쪽이 빈곳
        System.out.printf("%06d\n", value); // 6개. 왼쪽이 0도배, 오른쪽이 숫자

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름 %d인 원의 넓이: %010.2f\n", 10, area);
        System.out.printf("반지름 %d인 원의 넓이: %10.2f\n", 10, area);
        // 소수점 포함 10개 중에 소수점 아래 2개

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job); // -면 역방향이라고 생각

        System.out.printf("이름: %1$s, 나이: %2$d", "김자바", 25);
        // 순서도 지정할 수 있다.
    }
}
