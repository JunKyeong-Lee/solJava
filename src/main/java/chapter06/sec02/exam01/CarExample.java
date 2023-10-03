package chapter06.sec02.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("myCar.company = " + myCar.company);
        System.out.println("myCar.model = " + myCar.model);
        System.out.println("myCar.color = " + myCar.color);
        System.out.println("myCar.maxSpeed = " + myCar.maxSpeed);
        System.out.println("myCar.speed = " + myCar.speed);
        System.out.println();

        System.out.println("필드값 변경");
        myCar.speed = 60;
        System.out.println("myCar.speed = " + myCar.speed);
    }
}
