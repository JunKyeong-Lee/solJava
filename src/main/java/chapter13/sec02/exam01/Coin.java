package chapter13.sec02.exam01;

public class Coin {
    private int value;

    public Coin(int value) {
        System.out.println("value = " + value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
