package chapter05.sec01.exam01;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "123";
        String strVar2 = "123";
        String strVar3 = new String("123");
        String strVar4 = new String("123");

        System.out.println("----선언한 방식----");
        System.out.println("String strVar1 = \"123\";\n" +
                "String strVar2 = \"123\";\n" +
                "String strVar3 = new String(\"123\");\n" +
                "String strVar4 = new String(\"123\");");
        System.out.println();

        System.out.println("----문자열 리터럴 방식간의 비교----");
        System.out.println("(strVar1 == strVar2) : " +
                (strVar1 == strVar2)); // true
        System.out.println("(strVar1.equals(strVar2)) : " +
                (strVar1.equals(strVar2))); // true
        System.out.println();

        System.out.println("----문자열 리터럴과 new 연산자간의 비교");
        System.out.println("(strVar1 == strVar3) : " +
                (strVar1 == strVar3)); // false
        System.out.println("(strVar1.equals(strVar3)) : " +
                (strVar1.equals(strVar3))); // true
        System.out.println();

        System.out.println("----new 연산자간의 비교");
        System.out.println("(strVar3 == strVar4) : " +
                (strVar3 == strVar4)); // false
        System.out.println("(strVar3.equals(strVar4)) : " +
                (strVar3.equals(strVar4))); // true
        System.out.println();
    }
}
