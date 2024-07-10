package Collection.List;

import java.util.Vector;

//Vector is similar to ArrayList.However, Vector is synchronized and hence vector object is Thread safe.

public class DemoVector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("Cat");
        vector.addElement("Dog");
        vector.addElement("Lion");
        vector.addElement("Roger");
        vector.addElement("Duck");
        vector.addElement("Pig");
        vector.addElement("Sheep");

        System.out.println("Vector is Empty: " + vector.isEmpty());
        System.out.println(vector);
        System.out.println(vector.size());
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.elementAt(2));
        System.out.println(vector.remove(5));
    }
}
