package chapter06.sec06.exam05.package2;

import chapter06.sec06.exam05.package1.A;

public class C {
    public C() {
        A a = new A();
        a.field1 = 1; // 가능. public 이라
        // a.field2 = 2; // 뷸가능. default지만 다른 패키지라
        // a.field3 = 3; // 불가능. private 라

        a.method1(); // 가능. public 이라
        // a.method2(); // 불가능. default지만 다른 패키지라
        // a.method3(); // 불가능. private 라
    }
}
