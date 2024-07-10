package InnerClassDemo;

//outer class can not be static
class outerClass {
    void show() {
        System.out.println("Outer Class ");
    }
    //inner class
     class innerClass1 {
        void disply() {
            System.out.println("Inner Class");
        }
        //static inner class
        static class innerClass2 {
            void out() {
                System.out.println("Inner Static Class");
            }
        }
    }
}
public class DemoInnerClass {
    public static void main(String[] args) {
        //obj of Outer class
        outerClass obj = new outerClass();
        obj.show();
        //obj of inner class
        outerClass.innerClass1 obj1 = obj.new innerClass1();
        obj1.disply();
        //obj of Inner static class
        outerClass.innerClass1.innerClass2 obj2 = new outerClass.innerClass1.innerClass2();
        obj2.out();
    }
}
