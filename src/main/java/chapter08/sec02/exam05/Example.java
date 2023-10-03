package chapter08.sec02.exam05;

public class Example {
    public static void main(String[] args) {
        ABC abc = new ABC();

        A a = abc;
        a.methodA();
        System.out.println();

        B b = abc;
        b.methodB();
        System.out.println();

        AB ab = abc;
        ab.methodA();
        ab.methodB();
        ab.methodAB();
    }
}
