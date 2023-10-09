package chapter11.sec01.exam24;

public class StringToPrimitiveValueExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("123");
        double value2 = Double.parseDouble("333.333");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);
    }
}
