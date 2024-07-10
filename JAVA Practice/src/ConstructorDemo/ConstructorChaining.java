package ConstructorDemo;

public class ConstructorChaining {

    private final String s ;
    private final int a;
    public ConstructorChaining(){
            this("Constructor Chaining");
    }
    public ConstructorChaining (String s) {
        this(s,10);
    }
    public ConstructorChaining (String s,int a) {
        this.s = s;
        this.a = a;
    }
    public static void main(String[] args) {
         ConstructorChaining obj = new ConstructorChaining();
         System.out.println(obj.s + " : " + obj.a);
        } 
}