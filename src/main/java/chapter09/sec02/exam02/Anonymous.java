package chapter09.sec02.exam02;

public class Anonymous {
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV Anonymous.turnOn");
        }

        @Override
        public void turnOff() {
            System.out.println("TV Anonymous.turnOff");
        }
    };

    void method1() {
        RemoteControl localVal = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Audio Anonymous.turnOn");
            }

            @Override
            public void turnOff() {
                System.out.println("Audio Anonymous.turnOff");
            }
        };
        localVal.turnOn();
    }

    void method2(RemoteControl rc) {
        rc.turnOn();
    }
}
