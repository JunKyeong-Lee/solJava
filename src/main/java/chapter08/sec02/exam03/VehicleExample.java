package chapter08.sec02.exam03;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare(); // 인터페이스에는 없던 메소드 이므로

        Bus bus = (Bus) vehicle;

        bus.run();
        bus.checkFare();
    }
}
