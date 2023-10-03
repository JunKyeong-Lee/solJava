package chapter05.sec02.exam04;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87};

        int sum = 0;
        for (int i = 0; i < scores.length; i++) { // () 안씀!
            sum += scores[i];
        }
        System.out.println("sum = " + sum);

        System.out.println("avg = " + (double) sum / scores.length);
    }
}
