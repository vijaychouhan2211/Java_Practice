package Oops.Polymorphism;
//Method Overloading Polymorphism 
class Addition{
    public void Add(int a, int b){
        System.out.println((a+b));
    }
    public void Add(double a, int b){
        System.out.println((a+b));
    }
    public void Add(float a, int b){
        System.out.println((a+b));
    }
    public void Add(int a, float b){
        System.out.println((a+b));
    }   
}
public class PolymorphismOverloading {
    public static void main(String[] args) {
        Addition obj = new Addition() ; 
        obj.Add(5, 6);
        obj.Add(12.0, 12);
        obj.Add(5.0f, 3);
        obj.Add(5,6.5f);
        
    }
}
