package Multi_Threading.DemoThreadCase;

//Make the start(); method super

class Case7 extends Thread {
    public void start() {
        super.start();
        System.out.println("Start Method");
    }
    public void run() {
        System.out.println("Run Method");
    }
}
public class ThreadCase7 {
    public static void main(String[] args) {
        Case7 t = new Case7();
        t.start();
        System.out.println("Main Method ");
    }
}
/*
Possible Output 1:          Possible Output 2:                Possible Output 3:
    Run Method                     Start Method                    Start Method
    Start Method                   Main Method                     Run Method
    Main Method                    Run Method                      Main Method
*/
