package chapter02.sec01.exam04;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if (v1 > 10) {
            int v2;
            v2 = v1 - 10;
        }
//        int v3 = v1 + v2 + 5; // 오류!
        // 위에 블록 내부에서 선언됐기 때문에
        // 인식이 안된다.(없는 거라고 생각함)
    }
}
