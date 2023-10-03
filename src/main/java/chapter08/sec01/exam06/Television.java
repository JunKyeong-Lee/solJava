package chapter08.sec01.exam06;


public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Television.turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Television.turnOff");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > chapter08.sec01.exam04.RemoteControl.MAX_VOLUME) {
            this.volume = chapter08.sec01.exam04.RemoteControl.MAX_VOLUME;
        } else if (volume < chapter08.sec01.exam04.RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
