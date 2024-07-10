package Oops.Inheritance;

// Base class (superclass)
class Animal {
    void sound() {
        System.out.println("The animal makes a sound");
    }
}
// First subclass (child class)
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog makes a sound");
    }
    void eat() {
        System.out.println("The dog eats dog food");
    }
}
// Second subclass (child class)
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat makes a sound");
    }
    void eat() {
        System.out.println("The cat eats cat food");
    }
}
// Third subclass (child class)
class Mouse extends Animal {
    @Override
    void sound() {
        System.out.println("The mouse makes a sound");
    }
    void eat() {
        System.out.println("The mouse eats mouse food");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        Mouse myMouse = new Mouse();

        myDog.sound();
        myDog.eat();
        myCat.sound();
        myCat.eat();
        myMouse.sound();
        myMouse.eat();
    }
}
