package chapter12.sec01.exam06;

public class ThreadB extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("getName() = " + getName());
        }
    }
}
