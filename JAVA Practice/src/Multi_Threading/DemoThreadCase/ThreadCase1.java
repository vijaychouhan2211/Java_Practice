package Multi_Threading.DemoThreadCase;

//CASE 1: Thread Scheduler
//It the part of jvm. It is responsible to schedule threads that is if multiple threads are waiting to get the chances of execution
//then which order the threads will be executed is diced by thread scheduler. We cant expect the except algorithm,
//and it is weired jvm to jvm we cant except thread execution order and except output.
//Hence, when ever the situation came to multithreading there is no guaranty for exact output, but we can provide several possible outputs.

class Case1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i + " Child-Thread");
    }
}
public class ThreadCase1 {
    public static void main(String args[]) { // Main method itself is not a thread it is executed by the main thread
        Case1 t = new Case1();
        t.start();
         for (int i = 1; i <= 10; i++)
            System.out.println(i + " Main-Thread");
         t.start();
    }
}
