package chapter13.sec01.exam07;

public class Student {
    public int sno;
    public String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return (this.sno == student.sno) && (this.name.equals(student.name));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return sno + this.name.hashCode();
    }
}
