package Multi_Threading.DemoThreadCase;

//Simple Life Cycle of thread
//My thread = new my thread
//New state or bron state t.start at runnable If thread scheduler allocate the processors then the thread will be
//running state run methods complete then thread goes in death state.

class Case8 extends Thread {
    public void run() {
        System.out.println("Run Method");
    }
}

public class ThreadCase8 {
    public static void main (String[] args){
        Case8 t= new Case8();
        t.start();
        System.out.println("Main Method");
    }
}
