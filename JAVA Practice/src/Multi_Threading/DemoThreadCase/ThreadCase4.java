package Multi_Threading.DemoThreadCase;

//CASE 4: Overloading of run(); method
//Overloading of run method is always possible but thread class start method can invoke no argument run method the other overloaded
//method we have to call explicitly like a normal method call. Example is given below.

class Case4 extends Thread {
    public void run() {
        System.out.println("no-arg run");
    }
    public void run(int a) {
        System.out.println("int-arg run");
    }
}
public class ThreadCase4 {
    public static void main(String[] args) {
        Case4 t = new Case4();
        t.start(); //output : no-arg run
    }
}

//CASE 5: If you're not overriding run(); method