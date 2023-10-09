package chapter13.sec02.exam01;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(90));
        coinBox.push(new Coin(80));
        coinBox.push(new Coin(70));

        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("coin.getValue() = " + coin.getValue());
        }
    }
}
