package chapter05.sec02.exam10;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};

        int sum = 0;
        for (int score : scores) {
            sum += score;
            score += 10;
        }
        System.out.println("sum = " + sum);

        System.out.println("scores[0] = " + scores[0]);
    }
}
