package chapter07.sec03.exam02;

public abstract class Animal { // 추상 클래스
    public String kind;

    public void Breathe() {
        System.out.println("Animal.Breathe");
    }

    public abstract void sound(); // 추상 메소드
}
