package Java8.FunctionInterfaceDemo;

public class Main {
    public static void main (String [] args) {
        System.out.println("Hello System start");

        MyInterImpl myInter = new MyInterImpl();
        myInter.sayHello();


        Myinter i1 =new MyInterImpl() {
            @Override
            public void sayHello() {
                System.out.println("this is my first anonymous class");
            }
        };
        i1.sayHello();

        Myinter i2 =new MyInterImpl() {
            @Override
            public void sayHello() {
                System.out.println("this is my second` anonymous class");
            }
        };
        i2.sayHello();

//        using our interface with help of lambda

        Myinter i3 = ()->System.out.println("Using first time lambda expression");
        i3.sayHello();

        Myinter i4 = ()->System.out.println("Using second lambda expression");
        i4.sayHello();

    }
}