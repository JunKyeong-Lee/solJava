package chapter02.sec03.exam07;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        byte byteValue = Byte.parseByte("10");
        short shortValue = Short.parseShort("123");
        int intValue = Integer.parseInt("30000");
        long longValue = Long.parseLong("40000000000000"); // L이 있을 필요는 없다.
        float floatValue = Float.parseFloat("3.141592");
        double doubleValue = Double.parseDouble("3.12345");
        boolean booleanValue = Boolean.parseBoolean("true");

        System.out.println("byteValue = " + byteValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("booleanValue = " + booleanValue);


        String str1 = String.valueOf(10L);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
    }
}
