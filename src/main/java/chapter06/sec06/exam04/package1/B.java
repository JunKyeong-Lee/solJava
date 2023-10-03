package chapter06.sec06.exam04.package1;

public class B {
    A a1 = new A(true); // public 이므로 무조건 가능
    A a2 = new A(1); // 패키지가 같으므로 default 가능
    // A a3 = new A("문자열"); // private 생성자. 패키지가 같아도 불가능
}
