package chapter05.sec02.exam09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArr = {"java", "array", "copy"};
        String[] newStrArr = new String[5];

        System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);

        for (int i = 0; i < newStrArr.length; i++) {
            System.out.printf("newStrArr[%d] = %s\n", i, newStrArr[i]);
        }
    }
}
