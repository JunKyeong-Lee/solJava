package chapter05.sec02.exam08;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldArr = {1, 2, 3};
        int[] newArr = new int[5];

        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.printf("newArr[%d] = %d\n", i, newArr[i]);
        }
    }
}
