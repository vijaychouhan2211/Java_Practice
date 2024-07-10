package Java8.MethodReference;

public class RefDEmo {
    public static void main(String[] args) {
        System.out.println("Method Reference");

        //provide the implementation of WorkInter
        WorkInter workInter = () -> {
            System.out.println("This is do task new method");
        };
        workInter.doTask();

        //static method refer
        //className::methodName
        WorkInter workInter2 = Stuff :: doStuff;  // :: it's used to refer the method or to call the constructor
        workInter2.doTask();

        Runnable runnable = Stuff :: threadTask;
        Thread t = new Thread(runnable);
        t.start();

        //referring non-static method
        // object::methodName
        Stuff obj = new Stuff();
        Runnable runnable1 = obj :: printNumber;
        Thread d1 = new Thread(runnable1);
        d1.start();
    }
}
