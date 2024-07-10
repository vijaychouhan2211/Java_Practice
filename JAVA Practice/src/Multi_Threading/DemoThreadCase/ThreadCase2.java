package Multi_Threading.DemoThreadCase;

//CASE 2: Difference between t.start(); and t.run();
//In the case of t.start(); a new thread will be created which is responsible for the execution of the run method.
//But In the case of t.run(); the new thread went be created and the run method will be executed just like a normal method call
//my main thread. In this program we replace t.start(); with t.run(); then the output is child-thread - 10 times followed by the
//main-thread-10 times this total output produced by the main thread.

class Case2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i + " Child-Thread");
    }
}
public class ThreadCase2 {
    public static void main(String args[]) {
        Case2 t = new Case2();
        t.run();
        for (int i = 1; i <= 10; i++)
            System.out.println(i + " Main-Thread");
         t.start();
    }
}