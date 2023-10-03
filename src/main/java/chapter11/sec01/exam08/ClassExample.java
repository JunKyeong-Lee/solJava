package chapter11.sec01.exam08;


public class ClassExample {
    public static void main(String[] args) throws ClassNotFoundException {
        // 첫번째 방법
        Class clazz = Car.class;

        // 두번째 방법
        // Class clazz = Class.forName("chapter11.sec01.exam08.Car");

        // 세번째 방법
        // Car car = new Car();
        // Class clazz = car.getClass();

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());
    }
}

class Car {
}
