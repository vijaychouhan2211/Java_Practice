package Multi_Threading.ThreadTest;

public class JoiningThread {
    public static void main (String[] args) throws InterruptedException {
        Thread t1 = new Thread (() -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Thread-1 Is Running");
            }
        });

        Thread t2 = new Thread (() -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Thread-2 Is Running");
            }
        });

        t1.start();
        t2.start();
        t1.join();  //wait for t1 to finish
        System.out.println("---> Thread-1 Is Finished");

    }
}
