package InterfaceDemo;
//Implemention of Interface
interface Brids{
    public void fly();
    public void sleep();
}
class Crow implements Brids{
    public void fly(){
        System.out.println("Crow can Fly....");
    }
    public void sleep() {
        System.out.println("zzzz....");
    }
}
public class InterfaceDemo {

    public static void main(String[] args) {
        Crow obj = new Crow() ;
        obj.fly();
        obj.sleep();
    }
}
