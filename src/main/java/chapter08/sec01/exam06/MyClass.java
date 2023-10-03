package chapter08.sec01.exam06;


public class MyClass {

    RemoteControl rc = new Television(); // 필드에 구현 객체

    MyClass() {
    }

    MyClass(RemoteControl rc) { // 생성자의 매개값으로 구현 객체
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodA() {
        RemoteControl rc = new Audio(); // 인터페이스 변수에 구현객체 대입
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodB(RemoteControl rc) { // 구현객체를 매개변수로 사용하기.
        rc.turnOn();
        rc.setVolume(5);
    }
}