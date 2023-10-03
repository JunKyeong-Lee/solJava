package chapter06.sec05.exam05;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123-123", "Fred");

        System.out.println("p1.nation = " + p1.nation);
        System.out.println("p1.name = " + p1.name);
        System.out.println("p1.ssn = " + p1.ssn);

        // p1.nation = "america";
        // p1.ssn = "555-555";
        p1.name = "EE";
    }
}
