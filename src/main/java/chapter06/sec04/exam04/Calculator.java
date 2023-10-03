package chapter06.sec04.exam04;

public class Calculator {
    int plus(int x, int y) {
        return x + y;
    }

    double avg(int x, int y) {
        return (double) plus(x, y) / 2;
    }

    void execute() {
        println("실행결과: " + (avg(7, 10)));
    }

    void println(String message) {
        System.out.println(message);
    }
}
