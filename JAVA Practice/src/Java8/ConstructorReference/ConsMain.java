package Java8.ConstructorReference;

public class ConsMain {
    public static void main(String[] args) {
        System.out.println("Constructor Reference");

        //constructor reference
        //ClassName::new
        Provider provider = Student::new;
        Student student = provider.getStudent();
        student.display();
    }
}
