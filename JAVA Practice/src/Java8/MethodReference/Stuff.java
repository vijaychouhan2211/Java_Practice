package Java8.MethodReference;

import java.time.LocalDate;

public class Stuff {
    public static void doStuff() {
        System.out.println("Doing Some Task");
        System.out.println("Doing Nothing");
        LocalDate now = LocalDate.now();
        System.out.println(now);

    }

    public static void threadTask() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void printNumber() {
        for (int i = 10; i >= 1; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
