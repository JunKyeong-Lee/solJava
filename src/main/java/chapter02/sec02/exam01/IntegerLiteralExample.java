package chapter02.sec02.exam01;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1011; // 2진수 // 앞에 0b
        int var2 = 0206; // 8진수 // 앞에 0
        int var3 = 365; // 10진수 // X
        int var4 = 0xB3; // 16진수 // 앞에 0x

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
    }
}