package Multi_Threading.ThreadTest;

class Thread1 extends Thread {
    public Thread1(String threadname) {
        super(threadname);
    }
    public void run() {
        for (int i = 1 ; i <= 5 ; i++)
            System.out.println("Inside " + Thread.currentThread() + " " + i);
        }
}
public class DaemonThreadExample {
    public static void main(String[] args) {

        System.out.println("Main is Starting ");

        Thread thread1 = new Thread1("thread1");
        thread1.setDaemon(true);
        thread1.run();

        System.out.println("Main is Exiting");
    }
}
