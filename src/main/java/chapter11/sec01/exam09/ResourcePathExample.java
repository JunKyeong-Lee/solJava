package chapter11.sec01.exam09;

public class ResourcePathExample {
    public static void main(String[] args) {
        Class clazz = Car.class;

        String photo1Path = clazz.getResource("photo1.txt").getPath();
        String photo2Path = clazz.getResource("text/photo2.txt").getPath();

        System.out.println(photo1Path);
        System.out.println(photo2Path);
    }
}

class Car {
}