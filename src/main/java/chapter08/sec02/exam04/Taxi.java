package chapter08.sec02.exam04;

import chapter08.sec02.exam03.*;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
