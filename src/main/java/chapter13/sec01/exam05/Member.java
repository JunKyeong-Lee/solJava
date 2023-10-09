package chapter13.sec01.exam05;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            return (this.age == member.age) && (this.name.equals(member.name));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(this.name.hashCode() + "" + age);
    }
}
