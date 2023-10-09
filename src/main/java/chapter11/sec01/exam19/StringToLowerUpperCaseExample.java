package chapter11.sec01.exam19;

public class StringToLowerUpperCaseExample {
    public static void main(String[] args) {
        String str = "Java Programming";

        String lowerStr = str.toLowerCase();
        String upperStr = str.toUpperCase();

        System.out.println("str = " + str);
        System.out.println("lowerStr = " + lowerStr);
        System.out.println("upperStr = " + upperStr);
    }
}
