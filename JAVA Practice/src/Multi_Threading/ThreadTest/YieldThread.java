package Multi_Threading.ThreadTest;

public class YieldThread {
    public static void main (String[] args) {
        Thread t =new Thread (() -> {
            for (int i = 0; i <= 10; i++)
                System.out.println ("Thread Is Running");
            Thread.yield();
        });
        t.start();
    }
}
