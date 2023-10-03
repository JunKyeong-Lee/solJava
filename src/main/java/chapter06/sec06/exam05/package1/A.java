package chapter06.sec06.exam05.package1;

public class A {
    public int field1;
    int field2;
    private int field3;

    public A() {
        field1 = 1; // 가능
        field2 = 2; // 가능
        field3 = 3; // 가능

        method1(); // 가능
        method2(); // 가능
        method3(); // 가능
    }

    public void method1() {
    }

    void method2() {
    }

    private void method3() {
    }
}