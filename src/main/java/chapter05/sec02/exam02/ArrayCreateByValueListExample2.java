package chapter05.sec02.exam02;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[]{1, 2, 3};

        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("sum1 = " + sum1);

        int sum2 = add(new int[]{4, 5, 6});
        System.out.println("sum2 = " + sum2);
    }

    public static int add(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
