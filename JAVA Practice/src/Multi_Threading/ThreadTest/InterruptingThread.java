package Multi_Threading.ThreadTest;

import java.lang.Thread;

public class InterruptingThread {
    public static void main (String[] args) throws InterruptedException {
        Thread t = new Thread((Runnable) () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread Is Running");
                try {
                    Thread.sleep(1000); // sleep for 1 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        t.interrupt();
    }
}

