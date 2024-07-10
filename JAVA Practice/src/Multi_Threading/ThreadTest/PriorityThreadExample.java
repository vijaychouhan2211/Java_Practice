package Multi_Threading.ThreadTest;

//Min priority is 1
//Max priority is 10
//Default priority of thread class is 5

class A extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 50; i++) {
                System.out.println("Hey!!");
                Thread.sleep(3);
            }
        } catch (InterruptedException e) { throw new RuntimeException(e); }
    }
}
class B extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 50; i++) {
                System.out.println("What's Up!!");
                Thread.sleep(3);
            }
        } catch (InterruptedException e) { throw new RuntimeException(e); }
    }
}
class C extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 50; i++) {
                System.out.println("!!!");
                Thread.sleep(3);
            }
        } catch (InterruptedException e) { throw new RuntimeException(e); }
    }
}
public class PriorityThreadExample {
    public static void main(String[] args) {
        System.out.println("Main is Statring");

        Thread A = new A();
        A.setPriority(Thread.MAX_PRIORITY);
        A.start();

        Thread B = new B();
        B.setPriority(Thread.MIN_PRIORITY);
        B.start();

        Thread C = new C();
        C.setPriority(Thread.NORM_PRIORITY);
        C.start();

    }
}
