package Multi_Threading.ThreadTest;

public class SleepingThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0 ; i < 10 ; i++) {
                System.out.println("Main Thread is running");
                try {
                    Thread.sleep(2000); // pause for 2-second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }
}
