package chapter05.sec02.exam06;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        int[][] scores = new int[2][3];
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) { // 계단형이어도 순회 가능
                System.out.printf("scores[%d][%d] = %d\n", i, j, scores[i][j]);
            }
        }
        System.out.println("----------------");

        int[][] scores2 = {{95, 30}, {1, 2, 3}};
        for (int i = 0; i < scores2.length; i++) {
            for (int j = 0; j < scores2[i].length; j++) { // 계단형이어도 순회 가능
                System.out.printf("scores2[%d][%d] = %d\n", i, j, scores2[i][j]);
            }
        }
        System.out.println("----------------");
    }
}
