package Java8.Lambda_Expression.ThreadDemo;

public class ThreadDemo {
    public static void main(String[] args) {

        //First Thread: Thread Joy
        Runnable thread1 = () -> {
            //this is the body of the thread
            for (int i = 1; i <= 10; i++) {
                System.out.println("Value of i: " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        };
        Thread t = new Thread(thread1);
        t.setName("Joy");
        t.start();
        System.out.println("Thread Name: " + t.getName());


        //Thread for creating table
        Runnable thread2 = () -> {
            try{
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i*2);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread tt = new Thread(thread2);
        tt.start();

    }
}
