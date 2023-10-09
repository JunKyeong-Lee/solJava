package chapter12.sec01.exam03;

import java.awt.*;

public class BeepPrintExample3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0;i<5;i++){
                    toolkit.beep();
                    System.out.println("띵1");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();

        for(int i=0;i<5;i++){
            System.out.println("띵2");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
