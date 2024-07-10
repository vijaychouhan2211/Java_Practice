package InnerClassDemo;

abstract class outerDemo {
    void show() {
        System.out.println("Outer demo");
    }
//    Inner Class
    static class innerDemo {
        void show () {
            System.out.println("Inner demo");
        }
    }
}

class AnonymousInnerClassDemo extends outerDemo {
}

public class AnonymousInnerClass {
    public static void main (String[] args) {

        outerDemo obj1 = new outerDemo(){
        };
        outerDemo.innerDemo obj2 = new outerDemo.innerDemo() {
        };
        obj1.show();
        obj2.show();

        outerDemo obj = new AnonymousInnerClassDemo();
        obj.show();
    }
}
