package chapter11.sec01.exam20;

public class StringTrimExample {
    public static void main(String[] args) {
        String str1 = "   0 ";
        String str2 = "  1   234  ";

        String newStr = str1.trim() + str2.trim();
        System.out.println("newStr = " + newStr);
    }
}
