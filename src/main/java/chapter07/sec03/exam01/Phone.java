package chapter07.sec03.exam01;

public abstract class Phone {
    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("Phone.turnOn");
    }

    public void turnOff() {
        System.out.println("Phone.turnOff");
    }
}
