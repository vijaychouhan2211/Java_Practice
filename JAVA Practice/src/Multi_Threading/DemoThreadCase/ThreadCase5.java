package Multi_Threading.DemoThreadCase;

//CASE 5: If you're not overriding run(); method
//If your not override the run() method then thread class run() method will executed which have empty implementation.
//Hence, we will not get any output.
//Note:
//It is highly recommend to override run() method otherwise do not go for multithreading concept.

class Case5 extends Thread {

}
public class ThreadCase5 {
    public static void main(String[] args) {
        Case5 t = new Case5();
        t.start();
    }
}