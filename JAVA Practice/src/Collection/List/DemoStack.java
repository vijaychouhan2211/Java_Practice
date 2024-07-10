package Collection.List;

import java.util.Stack;

//The stack is the subclass of Vector. Stack extends the vector class

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(20);
        stack.push(50);
        stack.push(68);
        System.out.println(stack);
        System.out.println("pop " + stack.pop()); //print68
        System.out.println("peek " + stack.peek()); //print50
        System.out.println(stack.empty()); //print false
        System.out.println(stack.search(20)); //print index value 2
    }
}