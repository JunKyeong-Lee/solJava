package chapter05.sec02.exam03;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("arr1[%d] = %2d\t", i, arr1[i]);
        }
        System.out.println();

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        for (int i = 0; i < 3; i++) {
            System.out.printf("arr1[%d] = %2d\t", i, arr1[i]);
        }
        System.out.println();

        double[] arr2 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("arr2[%d] = %.1f\t", i, arr2[i]);
        }
        System.out.println();

        arr2[0] = 0.1;
        arr2[1] = 0.3;
        arr2[2] = 0.5;
        for (int i = 0; i < 3; i++) {
            System.out.printf("arr2[%d] = %.1f\t", i, arr2[i]);
        }
        System.out.println();

        String[] arr3 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("arr3[%d] = %s\t", i, arr3[i]);
        }
        System.out.println();
    }
}
