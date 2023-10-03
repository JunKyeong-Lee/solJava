package chapter06.sec06.exam05.package1;

public class B {
    public B() {
        A a = new A();
        a.field1 = 1; // 가능. public 이라
        a.field2 = 2; // 가능. default지만 같은 패키지라
        // a.field3 = 3; // 불가능. private 라

        a.method1(); // 가능. public 이라
        a.method2(); // 가능. default지만 같은 패키지라
        // a.method3(); // 불가능. private 라
    }
}
