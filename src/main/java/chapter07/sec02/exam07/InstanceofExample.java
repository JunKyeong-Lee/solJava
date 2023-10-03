package chapter07.sec02.exam07;

public class InstanceofExample {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();

        Child child1 = (Child) new Parent();
        Child child2 = new Child();
    }
}
