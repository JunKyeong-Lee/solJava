package chapter06.sec06.exam04.package2;

import chapter06.sec06.exam04.package1.A;

public class C {
    A a1 = new A(true); // public 이므로 무조건 가능
    // A a2 = new A(1); // 서로 다른 패키지이므로 ㅇefault 불가능
    // A a3 = new A("문자열"); // 애초에 private 라 불가능.
}
