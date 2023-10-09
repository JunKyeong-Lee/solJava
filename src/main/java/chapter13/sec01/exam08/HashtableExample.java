package chapter13.sec01.exam08;

import java.util.*;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("spring", "12");
        map.put("summer", "123");
        map.put("fall", "1234");
        map.put("winter", "12345");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("아이디: ");
            String id = sc.nextLine();
            System.out.print("비밀번호: ");
            String pwd = sc.nextLine();
            System.out.println();

            if (map.containsKey(id)) {
                if (map.get(id).equals(pwd)) {
                    System.out.println("로그인");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            } else {
                System.out.println("입력한 아이디가 존재하지 않습니다.");
            }
        }
    }
}
