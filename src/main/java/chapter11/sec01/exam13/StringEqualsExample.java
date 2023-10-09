package chapter11.sec01.exam13;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = new String("ㅁㄴㅇ");
        String strVar2 = "ㅁㄴㅇ";

        System.out.println("(strVar1==strVar2) = " + (strVar1 == strVar2));
        System.out.println("(strVar1.equals(strVar2)) = " + (strVar1.equals(strVar2)));
    }
}
