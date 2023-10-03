package chapter03.sec02.exam06;

public class StringConcatExample {
    public static void main(String[] args) {
        String str1 = "JDK" + 6.0; // 6.0 이후부터 모두 문자열
        String str2 = str1 + "특징";
        System.out.println(str2);

        String str3 = "JDK" + 3 + 3.0; // 3.0 이후부터 모두 문자열
        String str4 = 3 + 3.0 + "JDK"; // 앞에 3 + 3.0 은 double 이 되는게 우선
        System.out.println(str3);
        System.out.println(str4);
    }
}
