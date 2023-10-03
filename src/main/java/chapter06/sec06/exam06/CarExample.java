package chapter06.sec06.exam06;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-50); // 의도적으로 잘못된 속도 입력
        System.out.println("myCar.getSpeed() = " + myCar.getSpeed());

        myCar.setSpeed(30); // 알맞은 속도 입력
        System.out.println("myCar.getSpeed() = " + myCar.getSpeed());

        if (!myCar.isStop()) {
            myCar.setStop(true);
        }
        System.out.println("myCar.getSpeed() = " + myCar.getSpeed());
    }
}
