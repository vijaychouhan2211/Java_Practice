package Oops.Abstraction;
//Implementation of Abstract class
abstract class Vechile {
    public abstract void drive() ;
    public abstract void seats() ;
    public abstract void playmusic() ;
}
class Car extends Vechile{
    @Override
    public void drive(){
        System.out.println("Car....");
    }@Override
    public void seats() {
        System.out.println("Four seats");
    }@Override
    public void playmusic() {
        System.out.println("Play Music.....");
    }
}
class Bike extends Vechile {
    @Override
    public void drive(){
        System.out.println("Bike....");
    }@Override
    public void seats() {
        System.out.println("Two seats");
    }@Override
    public void playmusic() {
        System.out.println("Not supported yet.");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.seats();
        car.playmusic();

        Bike bike = new Bike();
        bike.drive();
        bike.seats();
        bike.playmusic();
    }
}