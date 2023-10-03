package chapter06.sec05.exam05;

public class Person {
    final String nation = "Korea"; // 바로 선언하는 방법
    final String ssn;
    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
