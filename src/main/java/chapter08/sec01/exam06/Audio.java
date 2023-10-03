package chapter08.sec01.exam06;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio.turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio.turnOff");
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
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }
}

