package chapter12.sec01.exam06;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("mainThread.getName() = " + mainThread.getName());

        ThreadA threadA = new ThreadA();
        System.out.println("threadA.getName() = " + threadA.getName());
        threadA.run();

        ThreadB threadB = new ThreadB();
        System.out.println("threadB.getName() = " + threadB.getName());
        threadB.run();
    }
}
