package chapter11.sec01.exam23;

public class AutoBoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj = 100;
        System.out.println("obj = " + obj);
        System.out.println("obj.intValue() = " + obj.intValue());

        int value = obj;
        System.out.println("value = " + value);

        int result = obj + 100;
        System.out.println("(obj + 100) = " + (obj + 100));
        System.out.println("result = " + result);
    }
}
