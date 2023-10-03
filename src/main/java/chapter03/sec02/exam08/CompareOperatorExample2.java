package chapter03.sec02.exam08;

public class CompareOperatorExample2 {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;
        System.out.println(v2 == v3); // true

        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.printf("%.40f\n", v4);
        System.out.printf("%.40f\n", v5);
        System.out.println(v4 == v5); // false
        System.out.println((float) v4 == v5); // true
        System.out.println(Math.abs(v5 - v4) < 1e-7); // true
    }
}
