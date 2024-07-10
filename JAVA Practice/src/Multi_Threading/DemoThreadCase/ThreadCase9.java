package Multi_Threading.DemoThreadCase;

//After stating a thread we are trying to restart the same thread then we will get runtime exception saying IllegalThreadException.

class Case9 extends Thread {
    public void run() {
        System.out.println("Run Method");
    }
}
public class ThreadCase9 {
    public static void main(String[] args) {
        Case9 t = new Case9();
        t.start();
        System.out.println("Main Method");

        t.start();
    }
}
