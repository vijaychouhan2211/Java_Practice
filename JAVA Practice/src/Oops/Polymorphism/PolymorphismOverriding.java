package Oops.Polymorphism;
//Method Overriding Polymorphism
class Shape{
        public void Area(){
            System.out.print("Formula for Area of ");
        }
}
class Square extends Shape {
        public void Area(){
            System.out.print("Square is Side*Side \n");
        }
}
public class PolymorphismOverriding {
    public static void main(String[] args) {
        // Createing Object of class
        Shape shape = new Shape();
        shape.Area();
        
        Shape shape1 = new Square(); //type shape 1 is parent and the square is the child class
        shape1.Area();                
    }
}
