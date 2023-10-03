package chapter08.sec02.exam05;

public class ABC implements AB {
    @Override
    public void methodA() {
        System.out.println("ABC.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("ABC.methodB");
    }

    @Override
    public void methodAB() {
        System.out.println("ABC.methodAB");
    }
}
