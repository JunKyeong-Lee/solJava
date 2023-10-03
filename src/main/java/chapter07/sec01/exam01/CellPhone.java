package chapter07.sec01.exam01;

public class CellPhone {
    String model;
    String color;

    void powerOn() {
        System.out.println("powerOn");
    }

    void powerOff() {
        System.out.println("powerOff");
    }

    void bell() {
        System.out.println("bell");
    }

    void sendVoice(String message) {
        System.out.println("전송: " + message);
    }

    void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}
