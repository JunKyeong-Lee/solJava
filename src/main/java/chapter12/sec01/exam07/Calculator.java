package chapter12.sec01.exam07;

public class Calculator {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName() + ", num = " + this.num);
    }

}
