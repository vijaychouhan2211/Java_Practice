package Multi_Threading.ThreadTest;

class myRunnable implements Runnable {
    public void run() {
            System.out.println("Child Thread");
    }
}
public class MyRunnableDemo {
    public static void main(String[] args) {
        myRunnable r = new myRunnable();
        Thread t1 = new Thread();
        Thread t2 = new Thread(r);

//CASE 1: The new thread will be created and which is responsible for the thread class run method, which has empty implementation
        t1.start();

//CASE 2: No new thread will be created and the thread class will be executed just like normal method called
        t1.run();

//CASE 3: A new thread will be created which is responsible for the execution of myRunnable class run method
        t2.start();

//CASE 4: A new thread won't be created and myRunnable run method will be executed just like a normal method is called
        t2.run();

//CASE 5: We will get compile time error myRunnable doesn't have start capability cant find the symbol
        //r.start();

//CASE 6: No new thread will be created and myRunnable method will be executed like normal method called
        r.run();

        System.out.println("Main Thread");

    }
}
