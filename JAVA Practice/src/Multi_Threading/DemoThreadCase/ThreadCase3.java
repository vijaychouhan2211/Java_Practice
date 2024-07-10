package Multi_Threading.DemoThreadCase;

//CASE 3: Importance of Thread class start methods
//Thread class start is responsible to register the thread with the scheduler and all other mandatory activities hence without
//executing thread class start(); method there is no chance of starting the new thread in java due to this thread class start();
//method is consider as heart of multithreading.
//start{
//1. Resister the thread with thread scheduler
//2. perform all other mandatory actives
//3. after that invoke the run(); method
// }

class Case3 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i + " Child-Thread");
    }
}
public class ThreadCase3 {
    public static void main(String args[]) {
        Case3 t = new Case3();
        t.start();
         for (int i = 1; i <= 10; i++)
            System.out.println(i + " Main-Thread");
         t.start();
    }
}
