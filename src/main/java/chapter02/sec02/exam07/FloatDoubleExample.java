package chapter02.sec02.exam07;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // 일반적인 실수값
//        float var1 = 3.14; // 오류
        float var2 = 3.14f;
        double var3 = 3.14;

        // 정밀도 부분
        float var4 = 0.1234567890123456789f;
        double var5 = 0.1234567890123456789;

        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);


        // e 사용한 경우
        double var6 = 3e6;
        float var7 = 3e6f;
        double var8 = 2e-3;
        System.out.println("var6 = " + var6);
        System.out.println("var7 = " + var7);
        System.out.println("var8 = " + var8);
    }
}