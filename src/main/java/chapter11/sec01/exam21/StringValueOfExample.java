package chapter11.sec01.exam21;

public class StringValueOfExample {
    public static void main(String[] args) {
        String str1 = String.valueOf(30);
        String str2 = String.valueOf(new char[]{'a', 'b', 'c'});
        String str3 = String.valueOf(10.5);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
    }
}
